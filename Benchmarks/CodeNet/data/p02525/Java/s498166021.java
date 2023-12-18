import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numData;
		LinkedList<Integer> list = new LinkedList<Integer>();
		double average;
		double variance;
		while (true) {
			numData = 0;
			average = variance = 0;
			list.clear();
			try {
				numData = stdin.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				numData = 5;
			}
			if (numData == 0) {
				stdin.close();
				System.exit(0);
			}

			for (int i = 0; i < numData; ++i) {
				try {
					list.add(stdin.nextInt());
				} catch (Exception e) {
					e.printStackTrace();
				}
				average += list.getLast();
			}
			average /= numData;
			for (Iterator<Integer> i = list.iterator(); i.hasNext(); )
				variance += Math.pow(i.next() - average, 2);
			System.out.println(Math.sqrt(variance / numData));
		}
	}
}