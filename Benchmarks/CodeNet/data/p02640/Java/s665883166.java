import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=0;
		int b=x;
		boolean jud = false;

		for(int i=0;i<=x;i++) {
			if(y==2*a+4*b) {
				jud = true;
			}
			a++;
			b--;
		}
		if(jud) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}