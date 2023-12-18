import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r+1][c+1];
        for (int ir = 0; ir < r; ir++) {
            for (int ic = 0; ic < c; ic++) {
                a[ir][ic] = sc.nextInt();
                a[ir][c] += a[ir][ic];
                a[r][ic] += a[ir][ic];
                a[r][c] += a[ir][ic];
            }
        }
        for (int ir = 0; ir <= r; ir++) {
            for (int ic = 0; ic <= c; ic++) {
                System.out.print(a[ir][ic]);
                if (ic == c)
                    System.out.println("");
                else
                    System.out.print(" ");
            }
        }
    }
}
                
        
