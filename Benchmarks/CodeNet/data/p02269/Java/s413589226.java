import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dict = new ArrayList<String>();
		int bunki, n;
		String tmp;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			if (line.equals("insert")) {
				bunki = 0;
			} else {
				bunki = 1;
			}
			
			switch (bunki) {
				case 0:
				  tmp = sc.next();
				  dict.add(tmp);
				  break;
				
				case 1:
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