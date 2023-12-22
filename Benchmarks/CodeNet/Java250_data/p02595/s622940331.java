import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextLong();
		int[] X = new int[N];
		int[] Y = new int[N];
		int c=0;
		double dista = 0;
		for(int i=0;i<N;++i){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<N;++i){
			dista = Math.pow(X[i], 2) + Math.pow(Y[i], 2);
			if (D * D >= dista) {
				c++;
			}
		}
		System.out.println(c);
	}
}

