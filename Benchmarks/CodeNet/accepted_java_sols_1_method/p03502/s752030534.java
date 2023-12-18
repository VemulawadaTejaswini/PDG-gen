import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=N;
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		if(N%sum==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
