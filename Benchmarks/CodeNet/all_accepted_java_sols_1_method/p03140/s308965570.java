import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] A = scn.nextLine().toCharArray();
		char[] B = scn.nextLine().toCharArray();
		char[] C = scn.nextLine().toCharArray();

		int ans = 0;
		for(int i = 0;i < N;i++) {
			char a,b,c;
			a = A[i];
			b = B[i];
			c = C[i];

			if(a != b) {
				if(a!=c) {
					if(b != c) {
						ans+=2;
					}else {
						ans++;
					}
				}else {
					ans++;
				}
			}else {
				if(a != c) {
					ans++;
				}else {

				}
			}
		}
		System.out.println(ans);

	}

}
