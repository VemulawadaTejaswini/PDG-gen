import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		long max = 0;
		long ans = 0;
		
		for(int i = 0; i < n; i++) {
			int height = sc.nextInt();
			if(max < height) {
				max = height;
			}
			ans += max - height;
		}
		
		System.out.println(ans);
		sc.close();
	}
}


