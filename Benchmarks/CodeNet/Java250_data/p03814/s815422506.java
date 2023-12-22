import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int count = 0;
		int flag = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		String[] param = a.split("");
		for (int i = 0; i < a.length(); i++) {
			if (param[i].equals("A")) {
				flag = i;
				break;
			}
		}
		for (int j = flag; j < a.length(); j++) {
			count++;
			if (param[j].equals("Z")) {
				array.add(count);
			}
		}
		Collections.sort(array);
		Collections.reverse(array);
		System.out.println(array.get(0));
	}
}