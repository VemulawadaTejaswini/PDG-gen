import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); 
		Set<String> set = new HashSet<String>();
		scanner.nextLine();
		String s;
		for(int i =0;i<n;i++) {
			s = scanner.nextLine();
			set.add(s);
		}
	
		System.out.println(set.size());
	}
}