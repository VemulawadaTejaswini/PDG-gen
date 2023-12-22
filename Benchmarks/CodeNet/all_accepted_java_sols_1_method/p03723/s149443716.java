import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1){
            System.out.println(0);
            return;
        }
        if(a == b && b == c){
            System.out.println(-1);
            return;
        }
        int out = 0;
        while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
            long aa = b / 2 + c / 2;
            long ba = a / 2 + c / 2;
            long ca = a / 2 + b / 2;
            a = aa; b = ba; c = ca;
            out++;
        }
        System.out.println(out);
        scan.close();
    }
}
