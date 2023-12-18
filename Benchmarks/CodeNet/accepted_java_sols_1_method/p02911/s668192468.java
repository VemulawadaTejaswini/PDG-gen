import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int ans[] = new int[n];
		for(int i = 0; i < q;i++) {
			int a = sc.nextInt();
				ans[a-1]++;

		}
		for(int m = 0; m < n;m++) {
			if(k - (q - ans[m]) > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}