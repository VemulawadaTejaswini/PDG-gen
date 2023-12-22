import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		boolean result1 = (x+r) <= 0 ? false : W >= (x+r) ? true : false;
		boolean result2 = (y+r) <= 0 ? false : H >= (y+r) ? true : false;

		if(result1 & result2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		scan.close();

	}
}