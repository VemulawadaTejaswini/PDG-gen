import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x < y) {
			int temp1 = x;
			x = y;
			y = temp1;
		}
		int temp;
		temp = -1;
		while(temp != 0) {
		    temp = x % y;
			x = y;
			y = temp;
		}
		System.out.println(x);
	}

}

