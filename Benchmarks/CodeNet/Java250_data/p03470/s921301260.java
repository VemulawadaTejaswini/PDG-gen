import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		int[] mochi = new int[count];
		for (int i = 0; i < count; i++) {
			 mochi[i] = scn.nextInt();
		}
		//int[] mochiSort = new int[count];
		Arrays.sort(mochi);
		int total = 0;
		int tmp = 0;
		for (int i = 0; i < mochi.length; i++) {
			if(tmp != mochi[i] ) {
				tmp = mochi[i];
				total++;
			}
		}
		System.out.println(total);

	}

}
