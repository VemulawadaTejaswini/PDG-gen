import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.printf("%.6f\n",(n/2)/(double)n);
		}
		else
		{
			System.out.printf("%.6f\n",(n/2+1)/(double)n);
		}
		sc.close();
		
	}
}
