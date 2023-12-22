import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value1,value2;
		int i = 0;

		while(true){
			value1 = scan.nextInt();
			value2 = scan.nextInt();

			if (value1 == 0 && value2 == 0)
				break;
			System.out.printf("%d %d\n", value1 < value2? value1 : value2, value1 > value2? value1 : value2);
		}
	}
}