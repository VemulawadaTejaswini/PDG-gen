import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int x;
		int y;
		int z;
		
		if ((a < b) && (a < c)) {
			x = a;
			if (b < c) {
				y = b;
				z = c;
			}
			else {
				y = c;
				z = b;
			}
		}
		else if (b<c) {
			x = b;
			if (a < c) {
				y = a;
				z = c;
			}
			else {
				y = c;
				z = a;
			}
		}
		else {
			x = c;
			if (a < b){
				y = a;
				z = b;
			}
			else {
				y = b;
				z = a;
			}
		}
		
		System.out.println(x + " " + y + " " + z);

	}

}