import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int N = sc.nextInt();
		int[] tako = new int[N];
		for(int i = 0; i<N; i++) {
			tako[i] = sc.nextInt();
		}
		for(int j = 0; j<tako.length; j++) {
			for(int k = j+1; k<tako.length; k++) {
				total = total + (tako[j] * tako[k]);
			}
		}
		System.out.println(total);
    }
}