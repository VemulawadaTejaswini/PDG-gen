import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final int[] WEIGHT =
		{512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

	public static void main(String[] args) {
		 while(sc.hasNext()) { //??\?????¶?????°?????????
			 //??\???????????¨???
			 int num = sc.nextInt();
			 int[] ans = new int[WEIGHT.length];
			 Arrays.fill(ans, 0);

			 for(int $ = 0; $ < WEIGHT.length; $++) {
				 if(num >= WEIGHT[$]) {
					 ans[$] = WEIGHT[$];
					 num -= WEIGHT[$];
				 }
			 }

			 Arrays.sort(ans);

			 for(int $ = 0; $ < WEIGHT.length; $++) {
				 if($ == 9) {
					 System.out.println(ans[$]);
				 } else if(ans[$] != 0) {
					 System.out.print(ans[$] + " ");
				 }
			 }
		}

	}

}