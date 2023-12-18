import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		long ans = 1L;
		long s = 1000000000000000000L;
		
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			long a = scanner.nextInt();
			ans = ans *a;			
		}
		if(ans > s ) {
			ans = -1;
		}
		System.out.println(ans);
	}

}
