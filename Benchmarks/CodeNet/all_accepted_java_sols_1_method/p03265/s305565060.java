import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = Integer.parseInt(sc.next());
		int y1 = Integer.parseInt(sc.next());
		int x2 = Integer.parseInt(sc.next());
		int y2 = Integer.parseInt(sc.next());
		sc.close();
 
		int x = x2 - x1;
		int y = y2 - y1;
 
		System.out.print(x2 - y + " ");
		System.out.print(y2 + x + " ");
		System.out.print(x2 - y - x + " ");
		System.out.println(y2 + x - y);
	}
 
}