import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> mochis = new ArrayList<Integer>();
		for(int i=0; i<n; ++i) {
			int mochi = scan.nextInt();
			if(!mochis.contains(mochi)) {
				mochis.add(mochi);
			}
		}
		scan.close();
		System.out.println(mochis.size());
	}

}
