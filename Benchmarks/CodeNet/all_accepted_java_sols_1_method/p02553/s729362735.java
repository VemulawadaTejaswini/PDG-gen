import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long ac = (long)a*c;
        long ad = (long)a*d;
        long bc = (long)b*c;
        long bd = (long)b*d;
        long ans = Math.max(ac,ad);
        ans = Math.max(ans,bc);
        ans = Math.max(ans,bd);
        System.out.println(ans);
    }
}
