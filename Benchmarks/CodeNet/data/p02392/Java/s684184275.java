import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String input = in.readLine();
		 String numbers[] = input.split(" ");
		 int a = Integer.parseInt(numbers[0]);
		 int b = Integer.parseInt(numbers[1]);
		 int c = Integer.parseInt(numbers[2]);
		 
		 if(a < b && b < c){
			 System.out.println("Yes");
		 }
		 else{
			 System.out.println("No");
		 }

	}

}