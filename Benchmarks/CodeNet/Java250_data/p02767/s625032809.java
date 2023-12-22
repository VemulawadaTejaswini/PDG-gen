import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		int min =1000000;
		for(int i=0;i<=100;i++) {
			int temp = 0;
			for(int j=0;j<n;j++) {
				temp += Math.pow(x[j]-i, 2);
			}
			min = Math.min(min, temp);
		}
		System.out.println(min);
	}

}
