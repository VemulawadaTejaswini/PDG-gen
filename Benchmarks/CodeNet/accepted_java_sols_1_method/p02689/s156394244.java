import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		
		boolean[] check = new boolean[n];
		for(int i = 0; i < n; i++) {
			check[i] = true;
		}
		
		for(int i = 0; i < m; i++) {
			int temp1 = sc.nextInt() - 1;
			int temp2 = sc.nextInt() - 1;
			if(h[temp1] > h[temp2]) check[temp2] = false;
			else if(h[temp1] < h[temp2]) check[temp1] = false;
			else {
				check[temp1] = false;
				check[temp2] = false;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(check[i]) count++;
		}
		
		System.out.println(count);
		
	}

}
