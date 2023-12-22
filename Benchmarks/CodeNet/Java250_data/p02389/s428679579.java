import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	

	String[] line = reader.readLine().split(" ");

	int a = Integer.parseInt(line[0]);
	int b = Integer.parseInt(line[1]);

	int c = a * b;
	int d = a + a + b + b;

	System.out.println(c +" "+ d);
	}
}