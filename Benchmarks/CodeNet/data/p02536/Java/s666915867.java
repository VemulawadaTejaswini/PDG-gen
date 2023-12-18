import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		}
		int ans=(n-1)-m;
		if(ans>=0) {
			System.out.println(ans);
		}
		else{
			System.out.println(0);
		}
	}
}
