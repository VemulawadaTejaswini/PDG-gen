import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean hantei = false;
		int x = 0;
		int y = 0;
		while (hantei != true ) {
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			y = scan.nextInt();
			if (x == 0 && y ==0) {
				hantei = true;
			}else{
				if (x > y) {
					System.out.println(y+" "+x);
				}else {
					System.out.println(x+" "+y);
				}
			}
		}
	
