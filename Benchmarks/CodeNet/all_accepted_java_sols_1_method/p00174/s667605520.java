import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();

			if ("0".equals(str)) {
				return;
			}

			char[] one = str.toCharArray();
			char[] two = sc.next().toCharArray();
			char[] three = sc.next().toCharArray();

			int a_1 = 0, a_2 = 0, a_3 = 0, b_1 = 0, b_2 = 0, b_3 = 0;

			for (int i = 1; i < one.length; i++) {
				if (one[i] == 'A') {
					a_1++;
				} else if (one[i] == 'B') {
					b_1++;
				}
			}
			
			if(two[0] == 'A'){
				a_1++;
			} else if (two[0] == 'B') {
				b_1++;
			}
			
			for (int i = 1; i < two.length; i++) {
				if (two[i] == 'A') {
					a_2++;
				} else if (two[i] == 'B') {
					b_2++;
				}
			}
			
			if(three[0] == 'A'){
				a_2++;
			} else if (three[0] == 'B') {
				b_2++;
			}
			
			for (int i = 1; i < three.length; i++) {
				if (three[i] == 'A') {
					a_3++;
				} else if (three[i] == 'B') {
					b_3++;
				}
			}
			
			if(a_3 > b_3){
				a_3++;
			}else{
				b_3++;
			}
			
			System.out.println(a_1 + " " + b_1);
			System.out.println(a_2 + " " + b_2);
			System.out.println(a_3 + " " + b_3);
		}

	}
}