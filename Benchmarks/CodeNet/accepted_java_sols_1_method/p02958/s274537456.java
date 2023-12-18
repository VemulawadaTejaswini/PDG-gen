import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] P = new int[N];
		for(int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(P[i] != i + 1) {
				count++;
			}
		}
		if(count <= 2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}