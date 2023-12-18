import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		Stack<Integer> iStack = new Stack<Integer>();

		ArrayList<Integer[]> wStack = new ArrayList<Integer[]>();

		for (int i = 0; i < line.length(); i++) {
			String X = line.substring(i, i + 1);

			if (X.equals("\\")) {
				iStack.push(i);
			} else if (X.equals("/") && !iStack.empty()) {
				int Y = iStack.pop();
				Integer[] in = {Y, i - Y };
				
				for (int j = 0; j < wStack.size(); j++) {
					Integer[] kari = wStack.get(j);
					if (in[0] < kari[0]) {
						in[1] += kari[1];
						wStack.remove(j);
						j--;
					}
				}
				
				wStack.add(in);
			}

		}
		
		int bigsum = 0;

		for (int i = 0; i < wStack.size(); i++) {
			bigsum += wStack.get(i)[1];
		}
		System.out.println(bigsum);
		
		if (wStack.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.print(wStack.size());
			System.out.print(" ");
			
			for (int i = 0; i < wStack.size() - 1; i++) {
				System.out.print(wStack.get(i)[1]);
				System.out.print(" ");
			}
			System.out.println(wStack.get(wStack.size() - 1)[1]);

		}
	}
}