import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		boolean exist = false;
		for(int i = 0; i < a * b; i += a) {
			if(i % b == c) {
				exist = true;
				break;
			}
		}
		if(exist) System.out.println("YES");
		else System.out.println("NO");
	}
}