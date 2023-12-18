
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sumA = a;
		int sumB = b;
		for(int i=1;i<b;i++){
			sumA = Integer.valueOf("" + sumA + a);
		}
		for(int i=1;i<a;i++){
			sumB = Integer.valueOf("" + sumB + b);
		}
		System.out.println(Math.max(sumA, sumB));
		sc.close();
	}

}
