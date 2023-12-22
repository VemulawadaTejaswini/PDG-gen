import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			String []S = new String[N];
			Set<String>set = new TreeSet<String>();
			for(int i = 0;i<N;i++) {
				S[i] = scan.next();
				set.add(S[i]);
			}
			
			System.out.println(set.size());
			
		}
		
		
	}
		

}
