import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		int x,y,d,r;
		double f;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		d = x / y;
		r = x % y;
		f = 1.0 * x / y;

		System.out.printf("%1d %1d %1.5f",d, r, f);
    	}
}