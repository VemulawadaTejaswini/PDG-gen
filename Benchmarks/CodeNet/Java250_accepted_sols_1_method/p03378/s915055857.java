import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
		int[] road= new int[n+1];
		int left=0,right=0;

		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			road[a]=1;
		}

		for(int i=x;0<=i;i--) {
			left+=road[i];
		}
		for(int i=x;i<=n;i++) {
			right+=road[i];
		}
		System.out.println(left<right?left:right);

	}
}