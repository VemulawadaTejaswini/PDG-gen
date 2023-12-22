import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = b-a;
		int height = 0;
		for(int i = 1; i <= res; i++) {
			height += i;
		}
		System.out.println(height-b);
	}

}