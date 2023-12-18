//Structured Program I - Print a Rectangle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input;
		
		 while (!(input = in.readLine()).equals("0 0")) {

			 String[] HW = input.split(" ");

			 int H = Integer.parseInt(HW[0]);
			 int W = Integer.parseInt(HW[1]);

			 for(int i=0;i<H;i++){
				 for(int j=0;j<W;j++){
					 System.out.print("#");
				 }
				 System.out.println();
			 }
			 System.out.println();
			 
		 }

	}
}