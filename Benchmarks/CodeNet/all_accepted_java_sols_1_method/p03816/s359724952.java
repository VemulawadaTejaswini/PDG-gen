import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer>set = new HashSet<Integer>();
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ;i++) {
			int a = sc.nextInt();
			set.add(a);
		}
		
		int s = set.size();
		if(s % 2 == 1) {
			System.out.println(s);
		}
		else {
			System.out.println(s-1);
		}
		
	}

}
