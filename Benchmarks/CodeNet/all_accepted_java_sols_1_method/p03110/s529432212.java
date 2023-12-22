import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float sum = 0;
		for(int i = 0; i < N; i++) {
			float x =  sc.nextFloat();
			if("JPY".equals(sc.next())) {
				sum += x;
			}else {
				sum += x * 380000.0;
			}
		}
		System.out.println(sum);
	}
}
