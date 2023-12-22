import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int W, H, x, y;
	W = sc.nextInt();
	H = sc.nextInt();
	x = sc.nextInt();
	y = sc.nextInt();

	int judge;
	if (x + x == W && y + y == H)
	    judge = 1;
	else
	    judge = 0;

	System.out.println((double)(((double)W * (double)H) / 2) + " " + judge);
    }
}