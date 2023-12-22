import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int t=sc.nextInt();
		int s=sc.nextInt();
		int a=d/s;
		int b=d%s;
		if(a==t&&b==0) {
			System.out.println("Yes");
		}
		else if(a<t) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}
}