import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{


			double r=Double.parseDouble(reader.readLine());

			double S=Math.PI*r*r;
			double l=Math.PI*2*r;
			System.out.printf("%6f %6f", S, l);

			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}