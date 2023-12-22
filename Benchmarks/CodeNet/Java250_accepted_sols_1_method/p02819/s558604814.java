import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(true) {
			boolean b =true;
			for (int i=2;i*i<x;i++) {
				if (x%i==0) {
					b = false;
					break;
				}
			}
			if (b==true) {
				System.out.println(x);
				return ;
			}
			x++;
		}
	}
}