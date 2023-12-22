import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.println(0);
            return;
        }

        String ans = "";
        int c = 0;
        while(true){
            long pow = 2L << c;
            if(n % pow != 0){
                n -= Math.pow(-2, c);
                ans = "1" + ans;
            }else{
                ans = "0" + ans;
            }
            if(n == 0) break;
            c++;
        }
        System.out.println(ans);
    }
}