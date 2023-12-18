import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int num[] = new int[n];
			for (int i=0;i<n;i++) {
				num[i] = sc.nextInt();
			}
			int searchNum = sc.nextInt();
			int begin = 0,end = n-1,center = end/2,ans = 0;
			while (true) {
				ans++;
				if (num[center]==searchNum) {
					break;
				}
				if (num[center]>searchNum) {
					end = center - 1;
				}else{
					begin = center + 1;
				}
				center = (begin+end)/2;
				if (begin>=end) {
					break;
				}
			}
			System.out.println(ans);
		}
	}
}