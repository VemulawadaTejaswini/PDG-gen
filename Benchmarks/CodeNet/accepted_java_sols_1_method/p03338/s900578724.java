import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		int max = 0;
		
		for (int i = 1; i < a; i++) {
			
			String c = b.substring(0, i);
			String d = b.substring(i, a);
			
			int count = 0;
			
			Set<String> words = new HashSet<>();
			words.addAll(Arrays.asList(c.split("")));
			words.remove(" ");
			
			for (String str: words) {
				if (d.contains(str)) {
					count++;
				}
			}
			
			if (count > max) max = count;
			
		}
		
		System.out.println(max);
		
		
	}	
}
