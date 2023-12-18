import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int D = sc.nextInt();
            int x2k = sc.nextInt();
        sc.close();

        int tmp = 0;
        int ans = 0;
        int var = x2k;
        for(int i = 0 ; i < 10 ; i++){
            ans = r * var - D;
            System.out.println(ans);
            var = ans;
        }
   }
}
