import java.io.*;

public class Sisoku1{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int x = Integer.parseInt(line);
			System.out.printf("%d%n",x*x*x);
		} catch (IOException e){
			System.out.println(e);
		} catch (NumberFormatException e){
			System.out.println("error");
		}
	}
}