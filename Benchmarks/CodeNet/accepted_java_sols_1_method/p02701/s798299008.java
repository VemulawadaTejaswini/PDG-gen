import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			
			Set<String> uniq = new LinkedHashSet<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				uniq.add(sc.next());
			}

			System.out.println(uniq.size());
		}
	}

}