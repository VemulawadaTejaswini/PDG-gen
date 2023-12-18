import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 while(true){
			 String input = in.readLine();
			 String[] numbers = input.split(" ");
			 Integer a = Integer.parseInt(numbers[0]);
			 Integer b = Integer.parseInt(numbers[1]);
			 if(a.equals(0) && b.equals(0)){
				 break;
			 }
			 if(a > b){
				 System.out.println(b + " " + a);
			 }
			 else{
				 System.out.println(a + " " + b);
			 }
		 }
	}

}