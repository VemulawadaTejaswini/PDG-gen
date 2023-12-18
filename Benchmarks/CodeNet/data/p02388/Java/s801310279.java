import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args){

		//??\??????????????????
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

		String s;

		try{
		s=reader.readLine();
		try{
			int x=Integer.parseInt(s);

			System.out.println(cubeX(x));

		}catch(NumberFormatException e){
			System.out.println("??????:"+e);

		}


		}catch(IOException e){
			System.out.println("??????:"+e);
		}


	}//main??¢??°

	public static int cubeX(int x){

		return x*x*x;
	}

}