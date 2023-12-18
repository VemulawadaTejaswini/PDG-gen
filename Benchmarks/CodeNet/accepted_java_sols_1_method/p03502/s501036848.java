import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int i,sum=0;
		for(i=8;i>=0;i--) {
			sum+=(N%Math.pow(10,i+1))/Math.pow(10,i);
		}
		if(N%sum==0)System.out.println("Yes");
		else System.out.println("No");
	}
}