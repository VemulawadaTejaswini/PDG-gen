import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];

		int[] ans = new int[N];
		for(int i=0; i<N; i++){
			ans[i] = 0;
		}

		for(int i=0; i<M; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			ans[a[i]-1]++;
			ans[b[i]-1]++;
		}

		for(int i=0; i<N; i++){
    	System.out.println(ans[i]);
		}

	}

}
