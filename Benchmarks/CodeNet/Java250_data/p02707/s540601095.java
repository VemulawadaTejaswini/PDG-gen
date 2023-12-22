import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		int[] josi = new int[cnt-1];

		for(int i= 0; i< cnt-1; i++) {
			josi[i] = sc.nextInt();
		}

		int[] bukas = new int[cnt];
		for(int i = 0; i< cnt-1; i++) {
			bukas[josi[i]-1]++;
		}

		for(int buka : bukas) {
			System.out.println(buka);
		}
	}
}