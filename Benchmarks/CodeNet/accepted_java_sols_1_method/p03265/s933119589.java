import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x1 = stdIn.nextInt();
		int y1 = stdIn.nextInt();
		int x2 = stdIn.nextInt();
		int y2 = stdIn.nextInt();
		
		
		//まずは辺の長さを出す
		int a = x2 - x1;
		int b = y2 - y1;
		
		int y3 = y2 + a;
		int x3 = x2 - b;
		
		int x4 = x3 - a;
		int y4 = y3 - b;
		
		System.out.println(x3+" "+ y3+" "+x4+" "+y4);
		
		
	}

}
