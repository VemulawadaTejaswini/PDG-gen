import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b * 2 > a) {
			System.out.println("0");
		} else {
			System.out.println(a - b * 2);
		}
	}

}
