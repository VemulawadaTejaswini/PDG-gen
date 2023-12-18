
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<String>();
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				String com = sc.next();
				String str = sc.next();
				if(com.equals("insert")) {
					dictionary.add(str);
				}
				else {
					if(dictionary.contains(str))
						System.out.println("yes");
					else 
						System.out.println("no");
				}
			}
		}
	}
}


