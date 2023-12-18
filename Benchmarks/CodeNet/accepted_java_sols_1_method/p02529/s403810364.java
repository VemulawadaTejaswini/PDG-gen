import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new TreeSet<Integer>();
		int n = Integer.parseInt(br.readLine());
		int[] nary = new int[n];
		String[] nline = br.readLine().split(" ");
		for (int i=0; i<n; i++) nary[i] = Integer.parseInt(nline[i]);
		Arrays.sort(nary);
		
		int q = Integer.parseInt(br.readLine());
		String[] qline = br.readLine().split(" ");
		for (int j=0; j<q; j++) {
			int qnum = Integer.parseInt(qline[j]);
			for (int num : nary) {
				if (num == qnum) {
					set.add(qnum);
					continue;
				} else if (num > qnum) continue;
			}
		}
		System.out.println(set.size());
	}
}