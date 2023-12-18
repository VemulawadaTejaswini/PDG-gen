import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxDif = Integer.MIN_VALUE;
		for(int i = 0; i < num; i++) {
			for(int j = i + 1; j < num; j++) {
				maxDif = Math.max(maxDif, arr[j] - arr[i]);
			}
		}
		
		System.out.println(maxDif);
	}
}