import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{

			while(true){
			String str=reader.readLine();

			String[] str_Array=str.split(" ");
			int a=Integer.parseInt(str_Array[0]);
			int b=Integer.parseInt(str_Array[2]);
			String c=str_Array[1];

			if("?".equals(c))break;
			if("+".equals(c)){
				System.out.println(a+b);
			}else if("-".equals(c)){
				System.out.println(a-b);
			}else if("/".equals(c)){
				System.out.println(a/b);
			}else if("*".equals(c)){System.out.println(a*b);
}
			}

			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}