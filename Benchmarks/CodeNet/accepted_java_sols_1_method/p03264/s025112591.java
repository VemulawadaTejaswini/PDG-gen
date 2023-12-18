import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		int even = 0;
		int odd = 0;

		if(input % 2 == 1) {
          int a = input;
			while (a != 1) {
				a = a - 2;
				odd++;
			}
			even = input - odd;
		}else {
          int a = input;
			while (a != 0) {
				a = a - 2;
				even++;
			}
			odd = input - even;
		}
		System.out.println(odd * even);
	}
}