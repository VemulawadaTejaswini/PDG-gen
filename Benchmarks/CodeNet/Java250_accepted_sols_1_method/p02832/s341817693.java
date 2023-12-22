import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		int p = 1;
		for(int i=0;i<N;i++) {
			if(A[i] != p) {
				count++;
			}else {
				p++;
			}
		}
		if(p==1) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
	}
}