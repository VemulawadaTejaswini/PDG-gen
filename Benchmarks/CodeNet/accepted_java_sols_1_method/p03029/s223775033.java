import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int P = sc.nextInt();
        sc.close();

        int ans = (A*3 + P)/2;
        System.out.println(ans);

   }
}
