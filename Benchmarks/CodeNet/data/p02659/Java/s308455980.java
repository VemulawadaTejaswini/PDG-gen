

import java.util.*; 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = (long)(100 * Double.parseDouble(sc.next()));
		
		System.out.println((long)(a*b)/100);
		sc.close();
	}
 
}