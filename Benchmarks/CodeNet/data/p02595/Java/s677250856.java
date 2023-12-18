import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0; i < n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();

		}
		
		int count=0;
		double dis = 0;

		for(int i=0; i < n; i++) {
			dis = Math.sqrt(x[i]*x[i] + y[i]*y[i]);
			if(dis <= d) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
