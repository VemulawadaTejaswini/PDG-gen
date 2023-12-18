import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		if(x+r<w&&x-r>0){
			if(y+r<h&&y-r>0){
				System.out.println("Yes");
			}else
				System.out.println("No");
		}else
			System.out.println("No");
	}
}