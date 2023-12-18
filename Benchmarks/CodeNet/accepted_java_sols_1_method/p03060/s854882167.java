import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] V = new int[N];
		int[] C = new int[N];
		for(int i = 0;i<N;i++) {
			V[i]=sc.nextInt();
		}
		for(int i = 0;i<N;i++) {
			C[i]=sc.nextInt();
		}
		sc.close();
		
		int sum=0;
		
		for(int i = 0;i<N;i++) {
			if(V[i]-C[i]>0) {
				sum+=V[i]-C[i];
			}
		}
		System.out.println(sum);
	}

}
