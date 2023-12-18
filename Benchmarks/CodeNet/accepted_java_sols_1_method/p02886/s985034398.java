import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i=0;i<n;i++){
			d[i] = sc.nextInt();
		}
		sc.close();
		int wa = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				wa += d[i] * d[j];
			}
		}
		System.out.println(wa);
	}
}
