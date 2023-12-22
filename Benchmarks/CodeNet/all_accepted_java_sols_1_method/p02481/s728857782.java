import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			int S = a * b;
			int L = 2*a + 2*b;
			System.out.println(S+" "+L);
	}
}