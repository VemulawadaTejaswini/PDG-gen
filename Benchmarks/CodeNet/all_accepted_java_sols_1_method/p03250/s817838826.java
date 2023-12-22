import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

		Integer[] cards = new Integer[3];

		for(int i=0;i<3;i++) {
			cards[i]=sc.nextInt();
		}
		Arrays.sort(cards,Collections.reverseOrder());
		String tmp = cards[0].toString() + cards[1].toString();
		Integer ans = Integer.valueOf(tmp) + cards[2];
		System.out.println(ans);

	}
}