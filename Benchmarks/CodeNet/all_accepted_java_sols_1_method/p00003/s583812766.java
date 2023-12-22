import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		int[] a=new int[3];
		int n=0;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		for (int j=0;j<n;j++) {
			a[0] = scan.nextInt();
			a[1] = scan.nextInt();
			a[2] = scan.nextInt();
			Arrays.sort(a);
			if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}