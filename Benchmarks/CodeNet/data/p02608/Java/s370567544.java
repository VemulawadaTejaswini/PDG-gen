import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int result[] = new int[10000];

		for(int x=1; x<=100; x++) {
			for(int y=1; y<=100; y++) {
				for(int z=1; z<=100; z++) {
					int a = (x*x) + (y*y) + (z*z) + (x*y) + (y*z) + (z*x);
					if(a<10000) {
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
