import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			a.add(sc.nextInt());
		}
	
		sc.close();
		
		
		int c = 0;
		int count = 0;
		Collections.sort(a);
		
		for (int i=0; i<n; i++,c=0) {
			while (a.get(i)%2 == 0) {
				c++;
				a.set(i, a.get(i)/2);
			}
			if (c == 0) {
				count = 0;
				break;
			} else {
				if (i==0) {
					count=c;
				}
				count = Math.min(count, c);
		        c=0;
			}
		
		}
		
		System.out.println(count);

		

	}

}
