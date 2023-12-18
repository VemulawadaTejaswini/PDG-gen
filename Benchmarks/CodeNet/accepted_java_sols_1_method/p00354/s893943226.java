import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String days[]= {"thu","fri","sat","sun","mon","tue","wed"};
		int date=in.nextInt();
		System.out.println(days[date%7]);
	}

}

