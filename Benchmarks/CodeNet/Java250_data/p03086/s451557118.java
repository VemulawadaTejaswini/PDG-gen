import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.next();
		char[] a = s.toCharArray();
		int max = 0;
		
		if(a.length==1) {
			if(a[0] == 'A' || a[0] == 'C' || a[0] == 'G' || a[0] == 'T') {
				System.out.println(1);
				System.exit(0);
			}
			else {
				System.out.println(0);
				System.exit(0);
			}
			
		}
		

		for (int i = 0; i < a.length - 1; i++) {
			count = 0;
			if (a[i] == 'A' || a[i] == 'C' || a[i] == 'G' || a[i] == 'T') {
				count++;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == 'A' || a[j] == 'C' || a[j] == 'G' || a[j] == 'T') {
					count++;
				} else {
					j = a.length;
				}
			}
			max = Math.max(max, count);
		}
		System.out.println(max);

		sc.close();
	}
}
