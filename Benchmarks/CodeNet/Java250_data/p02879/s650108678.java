import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean f = false;
		if(a < 10 && b < 10) {
			f = true;
		}
		if(f) {
			System.out.println(a * b);
		}else {
			System.out.println(-1);
		}
	}

}