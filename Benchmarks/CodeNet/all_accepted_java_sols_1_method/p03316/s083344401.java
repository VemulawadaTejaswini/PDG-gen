import java.util.*;

public class Main{
	public static void main(String[] artgs){
		int N = new Scanner(System.in).nextInt();
		int sn = 0;
		int x = N;
		while (x != 0){
			sn += x%10;
			x /= 10;
		}

		if (N%sn == 0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
