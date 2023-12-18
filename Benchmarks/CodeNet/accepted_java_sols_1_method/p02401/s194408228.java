import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		List<Integer> a = new ArrayList<Integer>(); 
		List<Integer> b = new ArrayList<Integer>(); 
		List<Character> op = new ArrayList<Character>();
		
		while (true) {
			int _a = scan.nextInt();
			char _op = scan.next().charAt(0);
			int _b = scan.nextInt();

			if (_op == '?')
				break;
			
			a.add(_a);
			b.add(_b);
			op.add(_op);
		}

		for (int i = 0; i < a.size(); i++) {
			int _a = a.get(i);
			int _b = b.get(i);
			int _op = op.get(i);
			
			switch(_op) {
				case '+':
					System.out.println(_a + _b);
					break;
				case '-':
					System.out.println(_a - _b);
					break;
				case '*':
					System.out.println(_a * _b);
					break;
				case '/':
					System.out.println(_a / _b);
			}
		}
		
		scan.close();
	}
}