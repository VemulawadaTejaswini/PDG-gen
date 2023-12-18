

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		
		int ans = B*(T/A);
		System.out.println(ans);
		
		
		sc.close();
	}
	
}
