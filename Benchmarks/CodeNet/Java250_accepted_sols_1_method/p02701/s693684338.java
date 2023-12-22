import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<String> array = new ArrayList<String>();

		while(sc.hasNext()) {
			String s = sc.next();
			int index = Collections.binarySearch(array, s);
			if(index < 0) {
				index = - (index + 1);
				array.add(index, s);
			}
		}

		int ans = array.size();

		System.out.println(ans);

		sc.close();

	}

}
