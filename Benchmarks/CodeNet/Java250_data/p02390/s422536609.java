import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		int a = 60*60;
		int b = 60;
		int x,h,m,s;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		x = Integer.parseInt(str);
		h = x/a;
		m = (x%a)/b;
		s = (x%a)%b;
		System.out.println(h + ":" + m + ":" + s);
	}
}