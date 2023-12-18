import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (i%3 == 0) System.out.print(" "+i);
			else if (String.valueOf(i).contains("3") || i%10==3) System.out.print(" "+i);
		}
		
		System.out.println();
		
	}
}
