import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int W=scanner.nextInt();
        int H=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int r=scanner.nextInt();
		if(x>=r && y>=r && x<=W-r && y<=H-r ){
			System.out.printf("Yes\n");
		}
		else System.out.printf("No\n");
	}
}
