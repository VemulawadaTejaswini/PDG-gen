import java.io.*;

public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			String line = reader.readLine();
			int number = Integer.parseInt(line);
			int answer = number * number * number;
			System.out.println(answer);
		} catch (IOException e){
			System.out.println(e);
		} catch (NumberFormatException e){
			System.out.println("値が不正です\n");
		}
	}
}
