import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b != 0){
			System.out.println(String.format("%d %d %f", a / b, a % b, a / (double)b));
		}
	}

}