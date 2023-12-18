import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int divideCount=0;
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			while (a % 2 ==0){
				a = a / 2;
				divideCount++;
			}
		}
		System.out.println(divideCount);
	}
}
