import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        int [] rs = new int[c];
        int [] cs = new int[r];
        int s = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                cs[i] += a[i][j];
                rs[j] += a[i][j];
                s += a[i][j];
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("" + a[i][j] + " ");
            }
            System.out.println(cs[i]);
        }
        for(int j = 0; j < c; j++) {
            System.out.print("" + rs[j] + " ");
        }
        System.out.println(s);
    }
}