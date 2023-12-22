import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		int max = 0;
		int s = 0;
		for(int i=0; i<N; i++) {
			L[i] = sc.nextInt();
			if(L[i]>=max) {
				max = L[i];
			}
			s += L[i];
		}
		sc.close();
		s -= max;
		if(max < s) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}