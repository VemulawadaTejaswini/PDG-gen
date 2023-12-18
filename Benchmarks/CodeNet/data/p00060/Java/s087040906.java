import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();

			int sum = c1 + c2; //????????????????????¨??????????????????????¶????
			int count  = 0;
			for(int $ = 1; $ < 11; $++) {
				if($ == c3) {
					continue;
				}
				if((sum + $) > 20) {
					break;
				}
				count++;
			}
			if(count >=  4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}