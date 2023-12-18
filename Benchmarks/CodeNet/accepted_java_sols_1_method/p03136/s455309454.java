import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int sum = 0;
		for(int i=0; i<list.size()-1; i++) {
			sum += list.get(i);
		}
		if(sum>list.get(n-1)) {
			System.out.println("Yes");
		}else if(sum <= list.get(n-1)){
			System.out.println("No");
		}
	}
}
