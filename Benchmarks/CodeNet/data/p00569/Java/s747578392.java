import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int number = sc.nextInt(); //枚数
			int no = sc.nextInt();  //何番目
			int[] cards = new int[n];
			List<Integer> result = new ArrayList<Integer>();
			for (int i=0; i<n; i++) cards[i] = sc.nextInt();

			for (int i=number; i<= n; i++) {
				int start = 0;
				while (start + i <= n) {
					int[] copy = new int[i];
					System.arraycopy(cards,start,copy,0,i);
					//for (int j:copy) System.out.print(j+" ");System.out.println("");
					Arrays.sort(copy);
					result.add(copy[no-1]);
					start++;
				}
			}
			Integer[] r = new Integer[result.size()];
			result.toArray(r);
			Arrays.sort(r);
			System.out.println(r[no]);
		}
	}
}
