import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		n[0] = Integer.parseInt(str[0]);
		n[1] = Integer.parseInt(str[1]);
		if(n[0]<n[1]) System.out.println("a < b");
		else if(n[0]==n[1]) System.out.println("a == b");
		else if(n[0]>n[1]) System.out.println("a > b");
	}
}