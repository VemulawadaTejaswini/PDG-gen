import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long v = sc.nextInt();
        long b = sc.nextInt();
        long w = sc.nextInt();
        long t = sc.nextInt();
        long diff = Math.abs(a - b);
        long c = v - w;
        boolean ans = false;
        if(0 < c && diff <= c*t){
            ans = true;
        }
        System.out.println(ans ? "YES" : "NO");
        sc.close();

    }

}
