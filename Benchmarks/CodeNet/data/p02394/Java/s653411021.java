import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int up = y + r;
        int ri = x + r;
        int le = x - r;
        int dw = y - r;

        if ( up <= H || ri <= W || le >= 0 || dw >= 0) {
        				System.out.println("Yes");
        }else {
        	System.out.println("No");
        }



	}

}

