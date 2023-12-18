import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();	
		sc.close();
		int x = x2-x1;
		int y = y1-y2;
		
		System.out.println((x2+y)+" "+(x+y2)+" "+(x1+y)+" "+(x+y1));
	}
}