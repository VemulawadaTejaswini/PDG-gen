import java.util.Scanner;

public class Main {
	long c[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =0;
		int min =1000;
		for (int i =0;i<N;i++) {
			int a= sc.nextInt();
			sum +=a;
			if (a%10!=0&&min>a) {
				min =a;
			}
		}
		if (sum %10!=0) {
			System.out.println(sum);
		} else if (min==1000){
			System.out.println(0);
		} else {
			System.out.println(sum-min);
		}
	}
}