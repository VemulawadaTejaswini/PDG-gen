import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] P = new int[N];
		
		int count = 0;
		for(int i=0;i<N;i++) {
			P[i] = sc.nextInt();
			if(P[i] != i+1) {
				count++;
			}
		}
		
		if(count<=2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();	
	}
}
