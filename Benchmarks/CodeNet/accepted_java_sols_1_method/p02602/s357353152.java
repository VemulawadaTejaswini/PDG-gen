import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] pointInfo = new int[n];
		for(int i =0; i < n; i++) {
			pointInfo[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = k; i < n;i++) {
			if(pointInfo[i] > pointInfo[j]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			j++;
		}
	}
}