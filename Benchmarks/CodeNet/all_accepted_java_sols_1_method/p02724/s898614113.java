import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int y500 = y/500;
		y =y - y500*500;
		int y5 = y/5;
		System.out.println(y500*1000+y5*5);
		
		
	}
}
