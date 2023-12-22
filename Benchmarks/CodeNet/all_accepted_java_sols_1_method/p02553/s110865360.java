import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			
			List<Long> lst = new ArrayList<>();
			
			lst.add(a*c);
			lst.add(a*d);
			lst.add(b*c);
			lst.add(b*d);
			
			Collections.sort(lst, Collections.reverseOrder());
			
			System.out.println(lst.get(0));
			
		}
	}

}