import java.io.*;
class Main{
	public static void main(String[] args) throws IOException {
		int i;
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		for(i=0;i<3;i++)
			n[i] = Integer.parseInt(str[i]);
		System.out.println((n[0]<n[1] && n[1]<n[2]) ? "Yes" : "No");
	}
}