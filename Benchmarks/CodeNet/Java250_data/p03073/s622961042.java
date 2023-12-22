import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count1 = 0;
		int count2 = 0;
		char x;
		for (int i = 0; i<S.length(); i++) {
			x = S.charAt(i);
			if (x == '0') {
				if (i % 2 == 0){
					count1++;
				}
				if (i % 2 == 1) {
					count2++;
				}
			}			
			if (x == '1') {
				if (i % 2 == 1){
					count1++;
				}
				if (i % 2 == 0) {
					count2++;
				}
			}
		}
		if (count1 > count2)
			System.out.println(count2);
		else
			System.out.println(count1);
	}
}	
