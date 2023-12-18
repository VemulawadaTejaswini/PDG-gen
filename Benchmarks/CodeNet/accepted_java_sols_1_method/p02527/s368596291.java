import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] ary = new int[n];
		String[] line = br.readLine().split(" ");
		for (int i=0; i<line.length; i++) ary[i] = Integer.parseInt(line[i]);
		Arrays.sort(ary);
		StringBuilder sb = new StringBuilder();
		for (int a : ary) sb.append(a).append(' ');
		System.out.println(sb.deleteCharAt(sb.length()-1).toString());
	}
}