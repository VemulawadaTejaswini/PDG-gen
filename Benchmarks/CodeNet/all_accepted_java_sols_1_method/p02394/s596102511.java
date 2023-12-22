import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    int W,H,x,y,r;
		Scanner scanner = new Scanner(System.in);
        W=scanner.nextInt();
        H=scanner.nextInt();
        x=scanner.nextInt();
        y=scanner.nextInt();
        r=scanner.nextInt();
		if(W>=x+r && H>=y+r && x>=r && y>=r ){
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
