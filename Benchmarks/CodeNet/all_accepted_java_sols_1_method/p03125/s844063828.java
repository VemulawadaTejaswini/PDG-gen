import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int a;
		int b;
		int c=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		if(b%a==0){
			c=a+b;
		} else {
			c=b-a;
		}

		System.out.println(c);
		return;

	}
}
