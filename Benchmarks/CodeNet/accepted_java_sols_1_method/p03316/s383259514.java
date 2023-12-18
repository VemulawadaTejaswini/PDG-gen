import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int s=0;
		while(num!=0) {
			s+=num%10;
			num/=10;
		}
		System.out.println(n%s==0?"Yes":"No");
	}
}