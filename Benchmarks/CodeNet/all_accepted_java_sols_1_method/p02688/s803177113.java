import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[10000];
		boolean  data[] = new boolean[n+1];
		int count =0;

		for (int i = 0;i<k ;i++ ) {
			  int d = sc.nextInt();
			for (int j = 0 ;j<d ;j++ ) {
				a[j] = sc.nextInt();
				  data[a[j]]=true;
			}
		}

		for (int i = 0;i<n+1 ;i++ ) {
			if (data[i]==false) {
				count++;
			}
		}

		System.out.println(count-1);
	}
}
