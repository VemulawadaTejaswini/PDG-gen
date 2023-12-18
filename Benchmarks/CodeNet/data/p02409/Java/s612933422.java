import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        int i;
        int living[][][] = new int[4][3][10];
        int b, f, r, v;
        for (i = 0; i < numInput; i++) {
            b = sc.nextInt() - 1;
            f = sc.nextInt() - 1;
            r = sc.nextInt() - 1;
            v = sc.nextInt();
            living[b][f][r] += v;
        }
        for (b = 0; b < 4; b++) {
            if (b != 0) System.out.println("####################");
            for(f = 0; f < 3; f++) {
                for(r = 0; r < 10; r++) {
                    System.out.print(" " + living[b][f][r]);
                }
                System.out.println();
            }
        }
    }
}
