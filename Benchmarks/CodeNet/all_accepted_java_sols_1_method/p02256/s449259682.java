import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int x=Math.max(a, b);
		int y=Math.min(a, b);

		while (x%y!=0) {
			int z=x%y;
			x=y;
			y=z;
		}
		System.out.println(y);
	}

}

