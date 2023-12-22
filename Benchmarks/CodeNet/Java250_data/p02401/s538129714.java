import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> results = new ArrayList<>();

		while (true) {
			String inputs = s.nextLine();
			String[] input = inputs.split(" ");
			int a = Integer.parseInt(input[0]);
			String op = input[1];
			int b = Integer.parseInt(input[2]);
			if(a>=0 && b>=0 && a<=20000 && b<=20000) {
			if (op.equals("?")) {
				break;
			}
			if (op.equals("+")) {
				results.add(a + b);
			} else if (op.equals("-")) {
				results.add(a - b);
			}else if(op.equals("*")) {
				results.add(a * b);
			}else if(op.equals("/")) {
				if(b!=0)results.add(a / b);
			}
		}
		}
		for(int j =0;j<results.size();j++) {
			System.out.println(results.get(j));
		}

	}
}