import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		int a,b,d,r;
		double f;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] st = s.split(" ");
		a = Integer.parseInt(st[0]);
		b = Integer.parseInt(st[1]);

		d = a/b;
		r = a%b;
		f = 1.0*a/b;

		System.out.println(d+" "+r+" "+f);

	}

}