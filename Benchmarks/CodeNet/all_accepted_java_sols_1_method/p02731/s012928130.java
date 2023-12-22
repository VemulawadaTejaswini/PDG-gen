import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
//		double result = 0;
//		for(int i = 1; i <= l-2; i++){
//			for(int j = l-i-1; j >= 1; j--){
//				int k = l - i - j;
//				result = Math.max(result, i*j*k);
////				System.out.println(i+","+j+","+k+" : " + result);
//			}
//		}
		double rrr = 0d;
		double a = 0.1d;
		while(a <= l - 0.2d){
			double b = l - a;
			while(b > 0){
				double c = l - a - b;
				rrr = Math.max(rrr, a * b * c);
				b -= 0.1d;
			}
			a += 0.1d;
		}
		float ll = l;

		System.out.println(ll/3*(ll/3)*(ll/3));
	}

}
