import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int i = 1;
		int c = x;
		ArrayList<Integer> yakusu = new ArrayList<Integer>();
		while(c >= i) {

//			System.out.println("pass");
			if(x % i == 0) {

				c = x / i;

				if(c < i) break;

				if(i == c) yakusu.add(c);
				else {
					yakusu.add(i);
					yakusu.add(c);
				}
			}
			i++;

		}

		int count = 0;
		for(int j = 0; j < yakusu.size(); j++) {
			if(yakusu.get(j) >= a && yakusu.get(j) <= b) {
				count++;
			}
		}

		System.out.println(count);

	}

}

