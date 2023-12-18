import java.util.Scanner;
import java.util.HashSet;

public class Main  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashSet<Integer> list = new HashSet<Integer>();
			
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0) {
				list.add(b);
				System.out.println(list.size());
			
			}else {
				System.out.println(list.contains(b) ? "1" : "0");
			}
		}
	}
}
