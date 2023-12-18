import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= m; i++) {
			for (int i1 = 20; i1 <= d; i1++) {
				int ten = i1 / 10;
				int one = i1 - ten * 10;
				
				if (ten <= 1 || one <= 1) {
					continue;
					
				} else if (i == ten * one) {
					count++;
//					System.out.println(i);
//					System.out.println(li);
				
				} else {
					continue;
				}
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}