//Cutting Down Water Bills
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String line;
	      while ((line = in.readLine()) != "-1") { 

			int n = Integer.parseInt(line);

			int p;
			if(n<=10){
				p=1150;
			}else if(n<=20){
				p=1150+(n-10)*125;
			}else if(n<=30){
				p=2400+(n-20)*140;
			}else{
				p=3600+(n-30)*160;
			}

			 System.out.println(p);
			
		}

	}
}