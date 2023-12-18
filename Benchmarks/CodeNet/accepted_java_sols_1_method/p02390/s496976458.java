import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		int n;
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine();
		n = Integer.parseInt(str);
		System.out.println(n/3600+":"+(n%3600)/60+":"+(n%3600)%60);
	}
}