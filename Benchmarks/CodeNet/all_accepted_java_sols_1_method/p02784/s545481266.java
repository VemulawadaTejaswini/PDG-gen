import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong();
		int n=sc.nextInt();
		//long n=sc.nextLong(),y=sc.nextLong();
		long sum=0;
		for(int i=0;i<n;i++) {
			sum+=sc.nextInt();
		}
		if(sum>=h) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
