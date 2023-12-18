import java.io.*;

class Main {

	public static void main(String args[]) throws IOException {
		int input;
        BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		int i=0;
		while( (input=Integer.parseInt(br.readLine())) != 0 ){
			i++;
			System.out.println("Case "+i+": "+input);
		}

	}

}