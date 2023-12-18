import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int max = 0;
		int mid = 0;
		int sum = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				max = a[i+1];
			}else {
				max = a[i];
			}
		}
		mid = max;
		for(int i=1;i<=k;i++) {
			mid = mid * 2;
		}
		sum = mid + a[0] + a[1] + a[2] - max;
		System.out.println(sum);
	}
}
