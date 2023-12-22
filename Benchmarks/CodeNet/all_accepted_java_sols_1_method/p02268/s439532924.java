import java.util.*;

public class Main{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int cnt = 0;
		int[] num = new int[n];

		for(int i=0; i< n;i++) {
			num[i] = sc.nextInt();
		}
    int m = sc.nextInt();
		for(int i = 0;i<m;i++) {
			int a = sc.nextInt();
			if (Arrays.binarySearch(num, a) > -1)
				cnt++;
		}
		System.out.println(cnt);
  }
}
