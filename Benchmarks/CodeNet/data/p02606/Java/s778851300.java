import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int d = scan.nextInt();
		int count = r/d - l/d;
		if(l % d == 0) {
			count++;
		}
		System.out.println(count);
	}

}