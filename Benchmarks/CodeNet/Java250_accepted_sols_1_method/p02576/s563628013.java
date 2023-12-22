import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double want = sc.nextInt();
		double can = sc.nextInt();
		double min = sc.nextInt();
		double bakeNum = Math.ceil(want / can) ;
		System.out.println((int)(bakeNum * min));
	}
}