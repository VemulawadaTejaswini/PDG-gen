import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		int[] n = new int[2];
		String[] str = new String[2];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		n[0] = Integer.parseInt(str[0]);
		n[1] = Integer.parseInt(str[1]);
		System.out.println(n[0]*n[1]+ " "+(2*n[0]+2*n[1]));
	}
}