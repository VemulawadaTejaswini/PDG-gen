import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int house[][][] = new int[4][3][10];
        for (int b = 0; b < 4; b++) {
        	for (int f = 0; f < 3; f++) {
        		for (int r = 0; r < 10; r++) {
        			house[b][f][r] = 0;
        		}
        	}
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
        	int b = scanner.nextInt() - 1;
        	int f = scanner.nextInt() - 1;
        	int r = scanner.nextInt() - 1;
        	int v = scanner.nextInt();
			house[b][f][r] += v;
        }
        for (int b = 0; b < 4; b++) {
        	for (int f = 0; f < 3; f++) {
        		for (int r = 0; r < 10; r++) {
        			System.out.print(" "+house[b][f][r]);
        		}
                System.out.println();
        	}
        	if (b < 3) System.out.println("####################");
        }
    }
}

