import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public Main(){}
	static int input;
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		input=Integer.parseInt(str);
		System.out.println((int)Math.pow(input,3));
		
		
	}
	
}