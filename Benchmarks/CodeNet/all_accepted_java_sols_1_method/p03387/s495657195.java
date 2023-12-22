import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []a = new int [3];
		int []b = new int [3];
		
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 3 ; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max,a[i]);
			sum += a[i];
		}
		
		if((3 * max) % 2 == sum % 2) {
			int ans = (3 * max  - sum)/2;
			System.out.println(ans);
		}
		else {
			int ans = (3* max + 1 - sum)/2 + 1;
			System.out.println(ans);
		}
		
	}

}
