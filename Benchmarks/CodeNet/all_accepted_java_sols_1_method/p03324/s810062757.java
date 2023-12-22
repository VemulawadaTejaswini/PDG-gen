import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		sc.close();
		if(D==0) {
			ans = (N!=100)?N:101;			
		}
		else {
			int tmp = 1;
			for(int i=0;i<D;i++) {
				tmp *=100;
				ans = (N!=100)?tmp*N:tmp*(N+1);
			}
		}
		System.out.println(ans);
	}
}