import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(W>=x+r&&x-r>=0) {
			if(H>=y+r&&y-r>=0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}

	}

}

