import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		//
		if(r <= x && (x + r) <= w && r <= y && (y + r) <= h){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		scan.close();

	}

}