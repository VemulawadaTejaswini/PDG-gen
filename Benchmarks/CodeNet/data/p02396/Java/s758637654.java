import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1;i<=10000;i++) {
			if(1<=x && x<=10000) {
				System.out.println("Case :"+i+": "+ x);
				x = sc.nextInt();
			} else if(x == 0) {
				break;
			}
		}
	}
}