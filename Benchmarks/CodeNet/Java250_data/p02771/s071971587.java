import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			List<Integer> lst = new ArrayList<Integer>();
			lst.add(a);
			lst.add(b);
			lst.add(c);
			
			long count = lst.stream().distinct().count();
			
			System.out.println(count == 2 ? "Yes" : "No");
			
		}
	}
}