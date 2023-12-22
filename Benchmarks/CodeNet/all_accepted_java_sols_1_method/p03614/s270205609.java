import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] == i + 1) {
				if(i + 1 < N) {
					//swapしないとまずいとき
					cnt++;
					int tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
				}
				else {
					cnt++;
					int tmp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = tmp;
				}
			}
		}
		System.out.println(cnt);
	}
}