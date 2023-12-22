import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		int h = time / 3600;
		int remain = time - (3600 * h);
		
		int m = remain / 60;
		int s = remain - (60 * m);
		
		
		System.out.println(h + ":" + m + ":" + s);
	}
}
