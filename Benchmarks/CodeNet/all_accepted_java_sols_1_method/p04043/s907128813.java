
import java.util.Scanner;

/**
  *http://abc042.contest.atcoder.jp/tasks/abc042_a
 * @author Cummin
 */
public class Main {

    public static void main(String[] args) {
        int A, B, C ;
        int Five = 0 ;
        int Seven= 0 ;
         // データの読み込み
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if (A==5) Five ++ ;
        if (A==7) Seven++ ;
        if (B==5) Five ++ ;
        if (B==7) Seven++ ;
        if (C==5) Five ++ ;
        if (C==7) Seven++ ;
        if ((Five==2) && (Seven==1)) {
            System.out.println("YES") ;
        } else {
            System.out.println("NO") ;
        }
    }
    
}
