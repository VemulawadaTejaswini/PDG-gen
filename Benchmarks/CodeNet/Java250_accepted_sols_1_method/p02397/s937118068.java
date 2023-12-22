import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scanner = new Scanner( System.in );

		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();

		while ( true ) {
			String inputText1 = scanner.next();
			String inputText2 = scanner.next();

			int x1 = Integer.parseInt(inputText1);
			int x2 = Integer.parseInt(inputText2);

			if ( x1 == 0 && x2 == 0 ) {
				break;
			}

			if ( x1 <= x2 ) {
				nums1.add(x1);
				nums2.add(x2);
			}
			else {
				nums1.add(x2);
				nums2.add(x1);
			}
		}

		for ( int i = 0; i < nums1.size(); i++ ) {
			System.out.println(nums1.get(i) + " " + nums2.get(i));
		}

		scanner.close();
	}
}