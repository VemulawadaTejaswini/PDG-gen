import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = k-q;
		}
		for(int i = 0; i < q; i++) {
			int cnum = sc.nextInt()-1;
			a[cnum]+=1;
		}
		for(int i:a) {
			if(i > 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
