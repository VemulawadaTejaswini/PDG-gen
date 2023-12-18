import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,j;
		int[] n = new int[10];
		String[] str = new String[10];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		for(i=0;i<5;i++)
			n[i] = Integer.parseInt(str[i]);
		System.out.println(n[2]<0 || n[3]<0 || n[2]+n[4]>n[0] || n[3]+n[4]>n[1]
			? "No" : "Yes");
	}
}