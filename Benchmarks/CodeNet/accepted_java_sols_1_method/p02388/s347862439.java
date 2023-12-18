import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String nb = buf.readLine();
		int x = Integer.parseInt(nb);
		System.out.println((int)Math.pow(x,3));
	}
}