import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Type = sc.nextInt();
		int Comd = sc.nextInt();
		double sum = 0;
		int cnt =0;
		double[] product = new double[Type];
		for(int i = 0; i < Type; i++) {
			product[i] = sc.nextInt();
		}
		for(int t = 0; t< Type ;t++) {
			sum += product[t];
		}
		for(int num = 0; num < product.length;num++) {
			if(product[num] >= sum / (4*Comd)) {
				cnt++;
			}
		}
		if(cnt >= Comd) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
