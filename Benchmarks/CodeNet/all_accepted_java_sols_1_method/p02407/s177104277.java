import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n ; i++ ) {
			
			int a = scanner.nextInt();
			
			list.add(a);
			
			
		
		}
	Collections.reverse(list);
	
	System.out.print(list.get(0));
	
		for (int i = 1; i < list.size(); i++ ) {
			
			System.out.print(" " + list.get(i));
		}
	System.out.println();
	}
	
	
}

