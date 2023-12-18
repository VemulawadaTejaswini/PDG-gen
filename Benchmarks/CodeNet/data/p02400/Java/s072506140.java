import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{


			int r=Integer.parseInt(reader.readLine());

			double S=(double)Math.PI*r*r;
			double l=(double)Math.PI*2*r;

			String strS=String.format("%.5f", S);
			String strl=String.format("%.5f", l);

			System.out.println(strS+" "+strl);

			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}