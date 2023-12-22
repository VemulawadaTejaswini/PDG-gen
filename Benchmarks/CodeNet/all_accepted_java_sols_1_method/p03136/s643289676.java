import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			int sum = 0;
			int max = 0;
			
			for (int i = 0; i < n; i++) {
				int l = sc.nextInt();
				sum += l;
				if (max < l) {
					max = l;
				}
			}
			
			int sum_o = sum - max;
			if (sum_o > max) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
 
		} finally {
			sc.close();
		}
	}
}


