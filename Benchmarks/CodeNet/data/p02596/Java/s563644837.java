import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int na=7;
		for(int ans=0;ans<=10;ans++) {
			
			if(na%k==0) {
				System.out.println(ans);
				break;
			}
			
			na=na*10+7;
			if(ans==0 && ans>=k) {
				System.out.println(-1);
			}
		}
		
	}
}