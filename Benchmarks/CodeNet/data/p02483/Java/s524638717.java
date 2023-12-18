import java.util.Scanner;

public class SortingThreeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int temp;

		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}

		if(b>c){
			temp = b;
			b = c;
			c = temp;
		}

		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}

	}
}