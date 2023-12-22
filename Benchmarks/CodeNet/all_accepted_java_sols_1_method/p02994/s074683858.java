import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),L=sc.nextInt();
		int min =100000;
		int sum=0;
		int eat=0;

		for(int i=1;i<=N;i++) {
			int tastes = L+i-1;
			sum+=tastes;
			if(Math.abs(tastes)<min) {
				min=Math.abs(tastes);
				eat=tastes;
			}
		}
		System.out.println(sum-eat);
	}
}
