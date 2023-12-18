import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		boolean[] b = new boolean[10*10000000+1];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] nline = br.readLine().split(" ");
		for (int i=0; i<n; i++) b[Integer.parseInt(nline[i])] = true;
		int q = Integer.parseInt(br.readLine());
		String[] qline = br.readLine().split(" ");
		int cnt = 0;
		for (int j=0; j<q; j++) if (b[Integer.parseInt(qline[j])]) cnt++;
		System.out.println(cnt);
	}
}