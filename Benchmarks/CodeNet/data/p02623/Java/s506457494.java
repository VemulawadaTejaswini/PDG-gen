import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int x = 200001;
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			if(x > a[i]) {
				x = a[i];
			}
		}
		
		for(int j=0;j<m;j++) {
			b[j] = scan.nextInt();
			if(x > b[j]) {
				x = b[j];
			}
		}
		
		int count = 0;
		int i = 0;
		int j = 0;
		for(int time=0;time+x<=k;count++) {
			if(i + j == m + n){
				break;
			}else if(i == n) {
				time += b[j];
				j++;
			}else if(j == m) {
				time += a[i];
				i++;
			}else if(a[i] < b[j]) {
				time += a[i];
				i++;
			}else {
				time += b[j];
				j++;
			}
		}
		System.out.println(count);

	}

}