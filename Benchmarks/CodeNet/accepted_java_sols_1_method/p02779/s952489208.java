import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Set<Long> numSet = new HashSet<>();
		boolean hasSame = false;
		for(int i = 0; i < n; i++) {
			Long num = sc.nextLong();
			if(numSet.contains(num)) {
				hasSame = true;
				break;
			}else {
				numSet.add(num);
			}
		}
		
		System.out.println(hasSame ? "NO" : "YES");
		sc.close();
	}

}