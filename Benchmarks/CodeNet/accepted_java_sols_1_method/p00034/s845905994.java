import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String[] strArr = in.nextLine().split(",");
			int[] larr = new int[12];
			int L = 0;
			for (int i = 0; i < 12; i++) {
                larr[i] = Integer.parseInt(strArr[i]);
				if(i < 10) {
					larr[i] *= 1000;
					L += larr[i];
				}
			}

			int l1 = (int)((double) (larr[10] * L) / (larr[11] + larr[10]));
			int sum = 0;
			for(int i=0;i<10;i++) {
				sum += larr[i];
				if(l1 <= sum) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}