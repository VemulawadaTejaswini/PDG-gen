import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		
		for(int i=1; i <= k; i++) {
			if(Math.abs(x-d) <= Math.abs(x+d)) {
				x = x-d;
			}else {
				x = x+d;
			}
		}
		System.out.println(Math.abs(x));
		
	}

}
