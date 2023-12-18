import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> compareList = new ArrayList<Integer>();
		compareList.add(1);
		compareList.add(9);
		compareList.add(7);
		compareList.add(4);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		if(list.containsAll(compareList)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
