import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int c=Integer.parseInt(a+b);
		for(int i=0;i*i<=c;i++) {
			if(i*i==c) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}