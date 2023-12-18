import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		}
		
		if(n-m-1>=0) {
			System.out.println(n-m-1);
		}
		else{
			System.out.println(0);
		}
	}
}
