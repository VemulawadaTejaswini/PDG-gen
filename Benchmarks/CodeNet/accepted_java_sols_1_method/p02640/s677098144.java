import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int turu = -1;
        int kame = -1;
        kame = (y - 2*x) / 2;
        turu = (y - 4 * kame) / 2;
        if( y % 2 != 0 || turu + kame != x || turu < 0 || kame < 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
    }
}
