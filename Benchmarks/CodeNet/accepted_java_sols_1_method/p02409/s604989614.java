import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[][][] houses = new int[4][3][10];	
	int n = scan.nextInt();
	for (int cnt = 0; cnt < n; cnt++) {
	    int b = scan.nextInt() - 1;
	    int f = scan.nextInt() - 1;
	    int r = scan.nextInt() - 1;
	    int v = scan.nextInt();
	    houses[b][f][r] += v;
	}
	for (int b = 0; b < 4; b++) {
	    for (int f = 0; f < 3; f++) {
		for (int r = 0; r < 10; r++) {
		    System.out.print(" " + houses[b][f][r]);
		}
		System.out.println();
	    }
	    if (b != 3) {
		for (int i = 0; i < 20; i++) {
		    System.out.print("#");
		}
		System.out.println();
	    }
	}
    }
}