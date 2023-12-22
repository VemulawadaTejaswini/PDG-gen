import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n;
		int[] S, C;
		while ((n = scn.nextInt()) != 0) {
			S = new int[n];
			C = new int[n];
			for (int i = 0; i < n; i++) {
				S[i] = scn.nextInt();
			}
			int ans = 0;
			boolean hururu = true;
			while (hururu) {
				hururu = false;
				for (int i = 0; i < n; i++) {
					int num = 0;
					for (int j = 0; j < n; j++) {
						if (S[j] == S[i])
							num++;
					}
					if (S[i] != num)
						hururu = true;
					C[i] = num;
				}
				for(int i = 0; i < n;i++) {
				S[i] = C[i];
				}
				ans++;
			}
			System.out.println(ans - 1);
			for (int i = 0; i < n; i++) {
				System.out.print(S[i]);
				if(i!=n-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scn.close();
	}
}


