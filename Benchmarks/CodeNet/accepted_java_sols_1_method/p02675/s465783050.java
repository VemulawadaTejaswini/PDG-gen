

import java.util.Scanner;

public class Main  {

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
		String s = String.valueOf(N);
		int size = s.length();
		s = s.substring(size - 1);
			N = Integer.parseInt(s);
			
			if (N == 2 | N == 4 | N == 5 | N ==7 | N == 9) {
				System.out.println("hon");
			}else if(N == 0 | N == 1 | N == 6 | N == 8) {
				System.out.println("pon");
			}else if(N == 3) {
				System.out.println("bon");
				
				
			}
			
		

	}

}
