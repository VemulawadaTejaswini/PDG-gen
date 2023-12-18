import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dict = new ArrayList<String>();
		int n;
		String tmp;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			switch (line) {
				case "insert":
				  tmp = sc.next();
				  dict.add(tmp);
				  break;
				
				case "find":
				  tmp = sc.next();
				  if (dict.indexOf(tmp) != -1) {
				  	System.out.println("yes");
				  } else {
				  	System.out.println("no");
				  	break;
				  }
			}
		}
	}
}