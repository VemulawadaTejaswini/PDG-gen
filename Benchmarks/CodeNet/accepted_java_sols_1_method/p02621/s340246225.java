import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =  new Scanner(System.in);
		double a = sc.nextInt();
		double ans = 0;
		ans = a+Math.pow(a,2)+Math.pow(a, 3);
		
		System.out.println((int)ans);
	}

}
