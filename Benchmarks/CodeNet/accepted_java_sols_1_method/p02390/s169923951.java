import java.util.*;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws java.lang.Exception { 
		sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		int m = S % 3600 / 60;
		int s = S % 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}

