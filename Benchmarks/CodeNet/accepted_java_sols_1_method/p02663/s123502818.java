import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int h1=sc.nextInt();
	int m1=sc.nextInt();
	int h2=sc.nextInt();
	int m2=sc.nextInt();
	int k=sc.nextInt();
	int min=60*(h2-h1)+(m2-m1);
	if(min<=k) {
		System.out.println(0);
	}
	else {
		System.out.println(min-k);
	}
	}
}
