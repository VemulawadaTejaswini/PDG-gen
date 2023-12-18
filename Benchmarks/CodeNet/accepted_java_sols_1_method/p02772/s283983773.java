import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		int precount = 0;

		for (int i = 0;i<n ;i++ ) {
			a[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			if (a[i]%2==0) {
				precount++;
				if (a[i]%3==0||a[i]%5==0) {
					count++;
				}
			}
		}

		if (count==precount) {
			System.out.println("APPROVED");
		}else{
			System.out.println("DENIED");
		}

	}
}
