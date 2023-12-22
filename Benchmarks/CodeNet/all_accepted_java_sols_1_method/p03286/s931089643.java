import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		List<Integer> list = new ArrayList<Integer>();
		scan.close();
		if(N == 0) {
			System.out.println(0);
		}else {
			while(N != 0) {
				if(N % - 2 == 0) {
					list.add(0);
				}else {
					list.add(1);
					N = N - 1;
				}
				N = N / -2;
			}
			for(int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}
}