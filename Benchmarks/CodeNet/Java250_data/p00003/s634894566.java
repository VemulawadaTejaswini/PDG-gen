import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int [n];
		int[] b = new int [n];
		int[] c = new int [n];
		for(int d = 0; d < n ; d++){
			a[d] = scan.nextInt();
			b[d] = scan.nextInt();
			c[d] = scan.nextInt();
		}
		for(int e = 0;e < n ; e++){
			if((a[e]*a[e]+b[e]*b[e]==c[e]*c[e]) || (b[e]*b[e]+c[e]*c[e]==a[e]*a[e]) || (c[e]*c[e]+a[e]*a[e]==b[e]*b[e])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}