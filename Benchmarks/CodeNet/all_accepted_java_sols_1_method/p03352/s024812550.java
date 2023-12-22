import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int limit = (int) Math.floor(Math.sqrt(X));
		int ans = 1;
		int max = 1;
		
		for(int i=1; i<=limit; i++) {
			for(int j=2; j<1000; j++) {
				max = (int)Math.pow(i, j);
				if(max <= X) {
					if(ans < max) {
						ans = max;
					}else {
						ans += 0;
					}
				}
			}
		}
		System.out.println(ans);

	}

}
