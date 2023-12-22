
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int count=0;
		while(true) {
			if(c%a==0) {
				count=count+1;
			}
			if(a==b) {
				break;
			}

			a=a+1;

		}
		System.out.println(count);
	}
}


