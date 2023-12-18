import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int minSum = 0;

		if(n%10 == 0) {
			System.out.println(10);
		}else {
			while(n > 0) {
				minSum = minSum + (n%10);
				n = n/10;
			}
			System.out.println(minSum);
		}

	}

}
