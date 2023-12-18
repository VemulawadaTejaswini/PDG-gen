import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        //int[] m = new int[N];
        
        for(int i=1; i<=b-a; i++){
            ans += i;
        }

        System.out.println(ans-b);
    }
}
