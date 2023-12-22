import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num;
		int point_Taro=0;
		int point_Hanako=0;
		int Taro, Hanako;
		char[] charstr_Taro;
		char[] charstr_Hanako;
		String str;
		String[] str_array;
		int len_Taro, len_Hanako;


		try{

			num=Integer.parseInt(reader.readLine());

			for(int i=0;i<num;i++){
				str=reader.readLine();
				str_array=str.split(" ");
				charstr_Taro=str_array[0].toCharArray();
				charstr_Hanako=str_array[1].toCharArray();

				len_Taro=charstr_Taro.length;
				len_Hanako=charstr_Hanako.length;


				for(int j=0;j<len_Taro&&j<len_Hanako;j++){//???????????????????????????????????????
					Taro=charstr_Taro[j];
					Hanako=charstr_Hanako[j];

					if(Taro>Hanako){

						point_Taro+=3;
					    break;
					}else if(Taro<Hanako){

						point_Hanako+=3;
					    break;
					}

					if(j==len_Taro-1 && len_Taro<len_Hanako){
						point_Hanako+=3;
						break;
					}else if(j==len_Hanako-1 && len_Taro>len_Hanako){
						point_Taro+=3;
						break;
					}else if(j==len_Taro-1&&len_Taro==len_Hanako){
					point_Hanako++;
					point_Taro++;
					break;}
				}



			}//num?????°????????????
			System.out.println(point_Taro+" "+point_Hanako);

		}catch(IOException e){
			System.out.print(e);
		}
	}

}