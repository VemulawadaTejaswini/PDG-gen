import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int S = sc.nextInt();
		int h = S/3600;
		S -= h*3600;
		int m  = S/60;
		S -= m*60;
		int s = S;
		System.out.println(h+":"+m+":"+s);
	}
}

