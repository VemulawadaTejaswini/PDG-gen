import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = 0;
		if(n == 0) {
			System.out.println(x);
		}else {
			int[] p = new int[n];
			for(int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			
			int min = 100;
			for(int i = 0; i <= 101; i++) {
				boolean flag = false;
				
				for(int j = 0; j < n; j++) {
					if(i == p[j]) {
						flag = true;
						break;
					}
				}
				
				if(flag) continue;
				
				if(Math.abs(x - i) < min) {
					min = Math.abs(x - i);
					ans = i;
				}
			}
		
			System.out.println(ans);
		}
		
	}

}
