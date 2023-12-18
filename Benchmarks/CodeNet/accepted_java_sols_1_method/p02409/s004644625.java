import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int[][][] a = new int[4][3][10];
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            a[scanner.nextInt() - 1][scanner.nextInt() - 1][scanner.nextInt() - 1] += scanner.nextInt();
        }

        for(int b = 0; b < 4; b++){
            for(int f = 0; f < 3; f++){
                for(int r = 0; r < 10; r++){
                    System.out.print(" " + a[b][f][r]);
                }
                System.out.print("\n");
            }
            if(b != 3) System.out.println("####################");
        }
    }
}

