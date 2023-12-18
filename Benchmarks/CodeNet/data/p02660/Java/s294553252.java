import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int t  = 0;
		for(int i=2; i<N; i++) {
			if(N%i==0) {
				int s=0;
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						s++;
					}
				}
				if(s>1) {
					t++;
				}
			}
		}
		System.out.println(t);
	}

}