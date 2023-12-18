import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n==0)break;
			int k = 0;
			for (int d = 5; d <= n; d *= 5) {
				k+=Math.ceil(n/d);
			}
			System.out.println(k);
		}
	}
}