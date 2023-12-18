import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = "";
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
		    str = sc.next();
		    set.add(str);
		}

		System.out.println(set.size());
		
    }
}

