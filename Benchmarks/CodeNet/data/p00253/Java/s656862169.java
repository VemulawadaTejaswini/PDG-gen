import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[] k = new int[n + 1];
			for (int i = 0; i < n + 1; i++) {
				k[i] = stdIn.nextInt();
			}
			IN: for (int i = 0; i < n + 1; i++) {
				int[] ktmp = new int[n];
				int p = 0;
				for(int j = 0; j < i; j++) {
					ktmp[p++] = k[j];
				}
				for(int j = i+1; j < k.length; j++) {
					ktmp[p++] = k[j];
				}
				for(int j = 2; j < ktmp.length; j++) {
					if(ktmp[j-1] - ktmp[j-2] != ktmp[j] - ktmp[j-1]) {
						continue IN;
					}
				}
				System.out.println(k[i]);
				break;
			}
		}
	}
}