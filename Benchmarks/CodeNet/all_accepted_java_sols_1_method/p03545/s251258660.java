import java.util.*;
 
public class Main {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    String ABCD = sc.next();
    int a = Integer.parseInt(ABCD.substring(0, 1));
    int b = Integer.parseInt(ABCD.substring(1, 2));
    int c = Integer.parseInt(ABCD.substring(2, 3));
    int d = Integer.parseInt(ABCD.substring(3, 4));
    
    if (a + b + c + d == 7) {
			System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
			return;
		}
		if (a + b + c - d == 7) {
			System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
			return;
		}
		if (a + b - c + d == 7) {
			System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
			return;
		}
		if (a + b - c - d == 7) {
			System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
			return;
		}
		if (a - b + c + d == 7) {
			System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
			return;
		}
		if (a - b + c - d == 7) {
			System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
			return;
		}
		if (a - b - c + d == 7) {
			System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
			return;
		}
		if (a - b - c - d == 7) {
			System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
			return;
		}
	}
}