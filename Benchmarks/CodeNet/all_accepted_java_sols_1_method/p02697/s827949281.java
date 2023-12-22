import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N%2 == 0) {
			int N_ = N/2;
			if (N_%2 == 0) {
				for (int i=0;i<N_/2;i++) {
					System.out.println((i+1)+" "+(N_-i));
					M--;
					if (M==0) return;
				}
				for (int i=0;i<N_/2-1;i++) {
					System.out.println((i+N_+1)+" "+(N-1-i));
					M--;
					if (M==0) return;
				}
			} else { // N_%2 == 1
				for (int i=0;i<N_/2;i++) {
					System.out.println((i+1)+" "+(N_-1-i));
					M--;
					if (M==0) return;
				}
				for (int i=0;i<N_/2;i++) {
					System.out.println((i+N_)+" "+(N-1-i));
					M--;
					if (M==0) return;
				}
			}
		} else { // N%2 == 1
			for (int i=0;i<M;i++) {
				System.out.println((i+1)+" "+(N-1-i));
			}
		}
	}
}