import java.io.*;

class Main{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int a = Integer.parseInt(div[0]);
		int b = Integer.parseInt(div[1]);
		
		int area = a * b;
		int length = 2 * (a + b);
		
		System.out.println(area + " " +length);
		
	}
	
}