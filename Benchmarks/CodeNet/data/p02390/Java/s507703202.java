import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int s = sc.nextInt();
		int m = s/60; s %= 60;
		int h = m/60; m %= 60;
		System.out.println(h+":"+m+":"+s);
		
	}
}
