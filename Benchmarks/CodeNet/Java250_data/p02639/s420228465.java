import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		int ans = 0;
		for(int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
			if(x[i] != i + 1) ans = i + 1;
		}
		System.out.println(ans);
		
		
		
	}

}
