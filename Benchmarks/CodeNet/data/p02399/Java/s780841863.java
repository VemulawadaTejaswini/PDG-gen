import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try{
		String line = reader.readLine();
		int a = Integer.parseInt(line);
		line = reader.readLine();
		int b = Integer.parseInt(line);

		int d=a/b;
		int r=a%b;
		double f=a/b;

		System.out.print(d +" ");
		System.out.print(r +" ");
		System.out.print(f + "\n");

		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("Error");
		}	 
	}
}