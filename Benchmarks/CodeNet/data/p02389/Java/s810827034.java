import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	String[] line = br.readLine().split(" ");

	int a = Integer.parseInt(line[0]);
	int b = Integer.parseInt(line[1]);

	int c = a * b;
	int d = 2*a+2*b;

	System.out.println(c +" "+ b);
	}
}