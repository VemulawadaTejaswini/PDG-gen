import java.util.Scanner;
public class XYZ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int result[] = new int[n+1];

		for(int x=1; x<=n; x++) {
			for(int y=1; y<=n; y++) {
				for(int z=1; z<=n; z++) {
					int a = (x*x) + (y*y) + (z*z) + (x*y) + (y*z) + (z*x);
					if(a<n) {
						result[a]++;
					}
				}
			}
		}
		for(int i=1; i<=n; i++) {
			System.out.println(result[i]);
		}
	}
}
