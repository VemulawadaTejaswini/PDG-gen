import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        soto: for(int i = 0; i <= n/4; i++){
            for(int j = 0; j <= n/7; j++){
                int k = 4*i+7*j;
                if (k == n) {
                    a = true;
                    System.out.println("Yes");
                    break soto;
                }
            }
        }
        if (a == false) {
            System.out.println("No");
        }
    }
}