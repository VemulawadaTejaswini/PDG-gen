

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		String s = null;
		String sb  = null;
		String s1 = null;
		String s3 = null;

		int cnt = 0;
		
	
		for (int i = a; i <= b; i++) {
			s = String.valueOf(i);
			s1 = s.substring(0, 2);
			s3 = s.substring(3, 5);
			StringBuffer reBuff = new StringBuffer(s3).reverse();
			if (s1.equals(reBuff.toString())) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}

}
