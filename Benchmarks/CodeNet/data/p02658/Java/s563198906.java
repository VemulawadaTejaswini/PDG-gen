import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int ans = 1;
		
		int n = scanner.nextInt();
		for(int i=0;i<n;n++) {
			int a = scanner.nextInt();
			ans = ans *a;			
		}
		if(ans > 1000000000*1000000000) {
			ans = -1;
		}
		System.out.println(ans);
	}

}
