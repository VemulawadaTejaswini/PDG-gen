import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		// 平方根
		double tmp = Math.sqrt(X);
		int tmp2 = (int)tmp;
		double ans = Math.pow(tmp2, 2) ;

		// 立方根
		tmp = Math.cbrt(X);
		tmp2 = (int)tmp;
		double ans2 = Math.pow(tmp2, 3);

		// 5乗根
		tmp = Math.pow(X, 1.0 / 5.0);
		tmp2 = (int)tmp;
		double ans3 = Math.pow(tmp2, 5);

		if (ans >= ans2){
			if (ans >= ans3){
				System.out.println((int)ans);
			}else{
				System.out.println((int)ans3);
			}
		}else{
			if(ans2 >= ans3){
				System.out.println((int)ans2);
			}else{
				System.out.println((int)ans3);
			}

		}
	}
}