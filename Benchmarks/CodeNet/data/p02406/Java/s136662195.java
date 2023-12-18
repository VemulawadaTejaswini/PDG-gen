//Structured Program I - Print a Frame
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int input =Integer.parseInt(in.readLine());
		
		for(int i=1;i<=input;i++){
			
			if(i%3==0){
				 System.out.print(" " + i);
			}else if(i%10==3){
				 System.out.print(" " + i);				
			}else if(i%100==3){
				 System.out.print(" " + i);				
			}else if(i%1000==3){
				 System.out.print(" " + i);				
			}
			
			
		}
		
	

	}
}