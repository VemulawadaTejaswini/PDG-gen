import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		String b=sc.next();	
		b=b.replace(".", "");
		
		int b2 = Integer.valueOf(b);
		
		System.out.println(a*b2/100);
	}
}