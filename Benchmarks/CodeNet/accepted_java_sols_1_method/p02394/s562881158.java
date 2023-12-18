import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(x>=r&&x<=h-r&&y>=r&&y<=w-r) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
