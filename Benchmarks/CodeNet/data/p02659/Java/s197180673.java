package problemC;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = a*b;
		System.out.println((long)c);
		sc.close();
	}

}
