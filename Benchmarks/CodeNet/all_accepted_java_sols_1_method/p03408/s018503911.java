
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] list1 = new String[n];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = scan.next();
		}
		
		int m = scan.nextInt();
		String[] list2 = new String[m];
		
		for (int i = 0; i < list2.length; i++) {
			list2[i] = scan.next();
		}
		
		
		int ans = 0;
		for (int i = 0; i < list1.length; i++) {
			int count = 0;
			String target = list1[i];
			
			for (int j = 0; j < list1.length; j++) {
				if (target.equals(list1[j])) {
					count++;
				}
			}
			
			for (int j = 0; j < list2.length; j++) {
				if (target.equals(list2[j])) {
					count--;
				}
			}
			
			ans = Math.max(ans, count);
			
		}
		
		System.out.println(ans);
	}
}
