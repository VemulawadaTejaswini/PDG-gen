import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int min = 10;
		int sum = 0;
		for (int i=0;i<5;i++) {
			a[i] = sc.nextInt();
			if (a[i]%10!=0) {
				sum +=(a[i]/10+1)*10;
			} else {
				sum +=a[i];
			}
			if (a[i]%10!=0&&a[i]%10<min) {
				min = a[i]%10;
			}
		}
		if (min <10) {
			sum-=10-min;
		}
		System.out.println(sum);
	}
}