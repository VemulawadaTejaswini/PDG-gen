import java.io.*;

public class Main{
	public static void main(String[] atgs){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String line = reader.readLine();
			int num = Integer.parseInt(line);
			System.out.println(num * num * num);
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("入力できる型はInt型に限ります");
		}
	}
}
