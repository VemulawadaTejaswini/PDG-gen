import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		if(n%2==0) {
			System.out.println((double)1/2);
		}else {
			double a=(n+1)/2;
			System.out.println(a/n);
		}
	}

}
