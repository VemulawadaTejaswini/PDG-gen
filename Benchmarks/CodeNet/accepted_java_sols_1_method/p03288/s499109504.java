import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1200)System.out.println("ABC");
		else if(n < 2800)System.out.println("ARC");
		else System.out.println("AGC");
	}
}
