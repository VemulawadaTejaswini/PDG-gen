import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder result = new StringBuilder();
		int numData = 0;
		try {
			numData = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			numData = 0;
		}
		for (int i = 0; i < numData; ++i) {
			try {
				list.add(stdin.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println();
			}
		}
		stdin.close();
		
		Collections.sort(list);
		for (Iterator<Integer> i = list.iterator(); i.hasNext(); )
			result.append(i.next() + " ");
		result.deleteCharAt(result.length() - 1);
		System.out.println(result);
	}
}