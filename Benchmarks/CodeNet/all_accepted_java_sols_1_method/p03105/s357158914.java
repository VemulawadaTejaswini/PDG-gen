import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int canSound = b/a;

        System.out.println(Math.min(canSound,c));
 
	}
}
