import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); 
        int[][] a = new int[12][10];
        for (int k = 0; k < n; k++) {
            int b = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            switch (b) {
                case 1 :
                    a[f-1][r-1] += v;
                    break;
                case 2 :
                    a[3+f-1][r-1] += v;
                    break;
                case 3 :
                    a[6+f-1][r-1] += v;
                    break;
                case 4 :
                    a[9+f-1][r-1] += v;
                    break;
                default :
                    break;
            }
        } 
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(" " + a[i][j]);
            System.out.println();
            if ((i == 2) || (i == 5) || (i == 8))
                System.out.println("####################");
        }
    }
}
