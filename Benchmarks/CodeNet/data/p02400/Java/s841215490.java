import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{

			String str=reader.readLine();

			int r=Integer.parseInt(str);

			double S=(double)Math.PI*r*r;
			double l=(double)Math.PI*2*r;

			System.out.println(S+" "+l);

			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}