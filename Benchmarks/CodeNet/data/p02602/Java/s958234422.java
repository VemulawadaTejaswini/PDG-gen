import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int hako[]=new int[n];
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}
		int list=hako[0];
		int ans;
		/////////////////////////////////////
		
		for(int i=k;i<n;i++) {
			ans=hako[i];
			if(ans>list) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			list=hako[i-k+1];//****
		}
		
	}

}
