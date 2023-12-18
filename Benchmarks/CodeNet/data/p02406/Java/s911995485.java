import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.printf(" ");
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%10==3) {
				System.out.printf(i +"");
				if(i!=n) {
					System.out.printf(" ");
				}
			}
		}
		System.out.println("");
	}
}
