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
		int maxNum;
		int smallerNum = arr[0];
		
		for(int i = 0; i < num; i++) {
			if (arr[i] <= smallerNum) {
				for(int j = i + 1; j < num; j++) {
					maxDif = Math.max(maxDif, arr[j] - arr[i]);
				}
			smallerNum = arr[i];
			}
		}
		
		System.out.println(maxDif);
	}
}