import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> a = new ArrayList<>();
		List<String> op = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(1);
		op.add("1");
		b.add(1);
		
		int cnt = 0;
		
		while(!(op.get(cnt).equals("?"))) {
			a.add(sc.nextInt());
			op.add(sc.next());
			b.add(sc.nextInt());
			
			cnt++;
		}

		for(int i = 1; i < a.size(); i++) {
			if(op.get(i).equals("+")) {
				System.out.println(a.get(i) + b.get(i));
			} else if(op.get(i).equals("-")) {
				System.out.println(a.get(i) - b.get(i));
			} else if(op.get(i).equals("*")) {
				System.out.println(a.get(i) * b.get(i));
			} else if(op.get(i).equals("/")) {
				System.out.println(a.get(i) / b.get(i));
			}
		}
	}
}