import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] height = new int[N];
		int max=1;
		int ans=0;

		for(int i=0;i<N;i++) {
			height[i]=sc.nextInt();
			if(max<=height[i]) {
				max=height[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}