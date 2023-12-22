import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double temp;
		double c;
		double lcm = 0;
		double top = 0;
		double ans = 0;

		List<Integer> num = new ArrayList();

		for (int i = 0; i < N; i++){
			int A = scan.nextInt();
			num.add(A);
		}
		for (int j = 0; j < N - 1; j++){
			double a = num.get(j);
			double b = num.get(j + 1);
			c = a;
			c *= b;
			while((temp = a % b) != 0) {
				a = b;
				b = temp;
			}
			lcm = c/b;
		}

		for (int i = 0; i < N; i++){
			double a = num.get(i);
			top += lcm / a;
		}

		if (N == 1){
			System.out.println(num.get(0));
		}else {
			ans = ((lcm) / (top));
			System.out.println(ans);
		}
	}
}