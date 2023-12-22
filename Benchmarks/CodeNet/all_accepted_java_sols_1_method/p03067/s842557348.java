import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int a = $.nextInt(), b = $.nextInt(), c = $.nextInt();
		if ((a < c && c < b) || (a > c && c > b))	System.out.println("Yes");
		else System.out.println("No");
		/*
		3 8 5 -> Yes
		7 3 1 -> No
		10 2 4 -> Yes
		31 41 59 -> No
		*/
	}
}
