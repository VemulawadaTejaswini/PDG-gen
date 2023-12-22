//0007:   Debt Hell
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		 int week = Integer.parseInt(in.readLine());

		 int debt = 100000;
		 
		 for(int i=0;i<week;i++){
			 debt =(int)Math.ceil(debt*1.05/1000)*1000;
		 }

			System.out.println(debt);

	}
}