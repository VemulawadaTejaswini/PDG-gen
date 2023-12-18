import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		int[] a = new int[m];
		int count = 0;
		
		for(int b = 0; b < m; b++) {
			a[b] = scanner.nextInt(); 
		}
		for(int r = 0; r < m; r++) {
			if(a[r] < x) {
				count++;
			}else {
				break;
			}
		}
		int ans = a[0] > x ? 0 : Math.min(a.length - count , count);
		System.out.println(ans);
	}

}