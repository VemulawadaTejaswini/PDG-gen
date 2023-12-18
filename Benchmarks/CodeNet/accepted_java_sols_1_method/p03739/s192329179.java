import java.util.Scanner;

/**
 * https://abc059.contest.atcoder.jp/tasks/arc072_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] a = new long[N];
		for(int i=0; i<N; i++) a[i] = sc.nextLong();
		sc.close();
		
		long ans = 0;
		long ans2 = 0;
		long sum = 0;
		for(int i=0; i<N; i++){
			if(i%2==0 && sum+a[i]>=0){
				ans = ans + (a[i]+sum) +1;
				sum = -1;
			}else if(i%2==1 && sum+a[i]<=0){
				ans = ans - (a[i]+sum) +1;
				sum = 1;
			}else{
				sum = sum + a[i];
			}
		}
		
		sum = 0;
		for(int i=0; i<N; i++){
			if(i%2==1 && sum+a[i]>=0){
				ans2 = ans2 + (a[i]+sum) +1;
				sum = -1;
			}else if(i%2==0 && sum+a[i]<=0){
				ans2 = ans2 - (a[i]+sum) +1;
				sum = 1;
			}else{
				sum = sum + a[i];
			}
		}
		
		System.out.println(Math.min(ans, ans2));

	}

}