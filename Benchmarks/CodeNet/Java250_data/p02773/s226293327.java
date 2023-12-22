import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s[] = new String[n];
		int data[] = new int [n];
		int count = 0;
		int max = 0;
		String ans[] = new String[n];
		int precount = 0;

		for (int i = 0;i<n ;i++ ) {
			s[i] = sc.next();
			ans[i] = s[i];
		}

		Arrays.sort(s);
		Arrays.sort(ans);

		for (int i = 0;i<n-1 ;i++ ) {
			if (s[i].equals(s[i+1])) {
				data[count]++;
				ans[count] = s[i];
				precount++;
			}else{
				max = Math.max(max,data[count]);
				count++;
			}
		}
		max = Math.max(max,data[count]);
		if (n-1==precount) {
			System.out.println(ans[0]);
			System.exit(0);
		}

		for (int i = 0;i<n ;i++ ) {
			if (max==data[i]) {
				System.out.println(ans[i]);
			}
		}




	}
}
