import java.io.*;
public class Main {
	
		public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			double r = Double.parseDouble(str);
			
			System.out.printf("%6f %6f",r*r*Math.PI ,2*r*Math.PI );
			
			
			
		}

}