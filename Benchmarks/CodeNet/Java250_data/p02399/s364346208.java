import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{

			String str=reader.readLine();
			String[] str_Array=str.split(" ");

			int a=Integer.parseInt(str_Array[0]);
			int b=Integer.parseInt(str_Array[1]);

			int d=a/b;
			int r=a%b;
			double f=(double)a/b;
			String after=String.format("%.5f", f);

			System.out.println(d+" "+r+" "+after);

			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}