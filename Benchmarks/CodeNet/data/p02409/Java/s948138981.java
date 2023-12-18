import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int[][][] ary = new int[4][3][10];
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt()-1;
            int f = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int v = sc.nextInt();
            ary[b][f][r] += v;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < 10; k++) {
                    sb.append(" ").append(ary[i][j][k]);
                }
                System.out.println(sb.toString());
            }
            if (i != 3) System.out.println("####################");
        }
    }
}