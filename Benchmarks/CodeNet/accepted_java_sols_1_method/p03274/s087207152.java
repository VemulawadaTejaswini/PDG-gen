import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 999999999;
		int[] x = new int[N];
		for(int i = 0 ; i < N ; i++){
			x[i] = sc.nextInt();
		}
		int a;
		int b;
		int tmp;
		for(int i = 0 ; i <= N-K ; i++){
			a = x[i];
			b = x[i+K-1];
			if(a >= 0){
				tmp = Math.abs(b);
			}else if(b <= 0){
				tmp = Math.abs(a);
			}else{
				tmp = Math.abs(a) + Math.abs(b) + Math.min(Math.abs(a), Math.abs(b));
			}
			ans = Math.min(tmp, ans);
		}
		System.out.println(ans);
	}
}