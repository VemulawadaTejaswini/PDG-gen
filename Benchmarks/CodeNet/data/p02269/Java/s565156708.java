import java.util.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> dict = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			String op = sc.next();
			String val = sc.next();
			
			if (op.equals("insert")) {
				dict.add(val);
			} else if (dict.contains(val)) {
				System.out.println("yes");
			} else  {
				System.out.println("no");
			}
			
		}
		
		
		
	}
}
