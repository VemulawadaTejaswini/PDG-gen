import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%10==7 || n/100==7 || (n/10)%10==7) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}