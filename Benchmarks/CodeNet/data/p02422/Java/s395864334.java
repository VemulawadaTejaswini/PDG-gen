import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num, a, b;
		String str, command, p;
		String[] array_command;
		char[] array_str, p_str;
		char x;


		try{
			str=reader.readLine();
			num=Integer.parseInt(reader.readLine());

			for(int i=0;i<num;i++){
				command=reader.readLine();
				array_command=command.split(" ");
				a=Integer.parseInt(array_command[1]);
				b=Integer.parseInt(array_command[2]);


				if(command.matches(".*print.*")){
					System.out.println(str.substring(a, b+1));

				}else if(command.matches(".*reverse.*")){
					array_str=str.toCharArray();

					for(int j=0;j<=(b-a-1)/2;j++){
						x=array_str[a+j];
						array_str[a+j]=array_str[b-j];
						array_str[b-j]=x;
					}
					str=String.valueOf(array_str);

				}else if(command.matches(".*replace.*")){
					p=array_command[3];
					p_str=p.toCharArray();
					array_str=str.toCharArray();

					for(int j=a;j<b+1;j++){
						array_str[j]=p_str[j-a];
					}
					str=String.valueOf(array_str);
				}


			}//?????????for?????????




		}catch(IOException e){
			System.out.print(e);
		}
	}

}