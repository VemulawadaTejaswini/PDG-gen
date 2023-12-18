import java.io.*;

class Main {

	public static void main(String args[]) throws IOException {
		int input;
		String str;

        	BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();

		input = Integer.parseInt(str);

		System.out.println(input*input*input);

	}

}