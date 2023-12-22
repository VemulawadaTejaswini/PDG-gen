import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		A[0] = sc.nextInt();
		int a = A[0];
		long s = 0;
		for(int i=1; i<N; i++) {
			A[i] = sc.nextInt();
			if(A[i]<=a) {
				s+=a-A[i];
			}else{
				a = A[i];
			}
		}
		sc.close();
		System.out.println(s);
	}

}