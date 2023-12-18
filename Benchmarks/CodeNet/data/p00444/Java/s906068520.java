import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] coin = {500,100,50,10,5,1};
		while (sc.hasNext()) {
			int change = 1000 - sc.nextInt();
			int num = 0;
			for (int i=0; i<6; i++) {
				while (change >= coin[i]) {
					change -= coin[i];
					num++;
				}
			}
			out.println(num);
		}
	}
}
