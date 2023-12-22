import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		//xの条件
		Boolean statusX = (x >= r && x <= (w-r)) ? true : false;
		//yの条件
		Boolean statusY = (y >= r && y <= (h-r)) ? true : false;
		
		if(statusX && statusY) System.out.println("Yes");
		else System.out.println("No");
	}

}