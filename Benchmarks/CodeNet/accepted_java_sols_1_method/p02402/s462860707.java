import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		long max = -1000000;
		long min = 1000000;
		long sum = 0;
		long[] num = new long[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(num[i] > max)
				max = num[i];
			if(num[i] <= min)
				min = num[i];
			sum += num[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}

