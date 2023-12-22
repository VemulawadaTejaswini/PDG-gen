import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] cost=new int[N];
		for(int i=0; i<N; i++) {
			cost[i]=sc.nextInt();
		}
		Arrays.sort(cost);
		int price=0;
		for(int i=0; i<N; i++) {
			if(i==N-1) {
				price+=(cost[i]/2);
			}
			else {
				price+=cost[i];
			}
		}
		System.out.println(price);
	}
}