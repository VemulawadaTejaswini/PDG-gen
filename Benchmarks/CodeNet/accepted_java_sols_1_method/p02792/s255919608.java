import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int first[][] = new int[10][10];
		for (int i=1;i<=N;i++) {
			int temp =i ;
			while (temp>=10) {
				temp/=10;
			}
			first[temp][i%10]++;
		}
		long count =0;
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				count += first[i][j]*first[j][i];
			}
		}
		System.out.println(count);
	}
}