import java.io.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder bu = new StringBuilder();
		int[][][] t = new int[4][3][10];
		int n = Integer.parseInt(sc.readLine());
		for(int i=0;i<n;i++){
			String[] st= sc.readLine().split(" ");
			int b = Integer.parseInt(st[0]);
			int f = Integer.parseInt(st[1]);
			int r = Integer.parseInt(st[2]);
			int v = Integer.parseInt(st[3]);
			t[b-1][f-1][r-1] += v;
		}
		for(int b = 0;b < 4;b++){
			for(int f = 0;f < 3;f++){
				for(int r = 0;r < 10;r++){
					bu.append(" ").append(t[b][f][r]);
				}
				bu.append("\n");
			}
			bu.append("####################\n");
		}
		bu.delete(bu.lastIndexOf("#")-20,bu.lastIndexOf("\n"));
		System.out.print(bu);
	}
}