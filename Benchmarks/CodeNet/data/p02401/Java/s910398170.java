import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();

		int result = 0;
		int cnt = 0;
		
		int a = 0;
		int b = 0;
		String op = "a";
		while(!(op.equals("?"))) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("?")) {
				break;
			} else if(op.equals("+")) {
				result = a + b;
				al.add(result);
				cnt++;
			} else if(op.equals("-")) {
				result = a - b;
				al.add(result);
				cnt++;
			} else if(op.equals("*")) {
				result = a * b;
				al.add(result);
				cnt++;
			} else if(op.equals("/")) {
				result = a / b;
				al.add(result);
				cnt++;
			}
		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(al.get(i));
		}
		
	}
}