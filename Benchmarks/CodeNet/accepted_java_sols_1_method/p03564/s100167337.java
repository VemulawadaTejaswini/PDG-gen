import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int r = 1;
		for(int i=0;i<n;i++){
			r = Math.min(r*2, r+k);
		}
		System.out.println(r);
	}
}