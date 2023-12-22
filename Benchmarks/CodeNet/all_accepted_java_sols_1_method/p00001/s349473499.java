import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arrays = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
             int a = sc.nextInt();
             arrays.add(a);
		}

		Collections.sort(arrays);

		for(int j = arrays.size(); j >arrays.size()-3; j--) {
			System.out.println(arrays.get(j - 1));
		}
	}

}