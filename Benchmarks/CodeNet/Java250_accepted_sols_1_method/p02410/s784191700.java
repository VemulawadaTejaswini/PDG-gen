import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int n, m, A[][], i, j, c, a = 1, cnt;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n][m];
         
        for(i = 0; n  > i; i++){
            for(j = 0; m > j; j++){
                A[i][j] = sc.nextInt();
            }
        }
         
        for(cnt = 0; cnt < m ; cnt++){
            a = sc.nextInt();
            b.add(new Integer(a));
        }
         
        for(i = 0; n > i ; i++){
            c = 0;
            for(j = 0;m > j; j++){
                c += b.get(new Integer(j)) * A[i][j];
            }
            System.out.println(c);
        }
    }
}