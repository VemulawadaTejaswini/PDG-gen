import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str, text;
		int num, position;

		try{

			while(true){
				str=reader.readLine();

				if(str.equals("-"))break;

				num=Integer.parseInt(reader.readLine());

				for(int i=0;i<num;i++){
					position=Integer.parseInt(reader.readLine());

					text=str.substring(0, position);
					str+=text;
					str=str.substring(text.length(), str.length());
				}
				System.out.println(str);

			}


		}catch(IOException e){
			System.out.print(e);
		}
	}

}