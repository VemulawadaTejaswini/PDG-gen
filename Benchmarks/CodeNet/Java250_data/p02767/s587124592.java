import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N= sc.nextInt();
		int a[]=new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int min = 100000000;
		for (int i=1;i<=100;i++) {
			int sum=0;
			for (int j=0;j<N;j++) {
				sum += (a[j]-i)*(a[j]-i);
			}
			if (sum<min) {
				min =sum;
			}
		}
		System.out.println(min);
	}

}