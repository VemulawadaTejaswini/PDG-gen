
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		String[] S = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine());
		String[] T = br.readLine().split(" ");
		int count = 0;
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < n; j++) {
				if (Integer.parseInt(S[i]) == Integer.parseInt(T[j])) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}