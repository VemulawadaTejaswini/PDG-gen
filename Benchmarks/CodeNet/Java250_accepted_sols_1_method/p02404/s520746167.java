//Structured Program I - Print a Frame
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
					 
					 if(i==0 || j ==0 || i==H-1 || j==W-1 ){
						 System.out.print("#");
					 }else{
						 System.out.print(".");						 
					 }
				 }
				 System.out.println();
			 }
			 System.out.println();
			 
		 }

	}
}