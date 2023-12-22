import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = n  + (int)Math.pow(n,2) + (int)Math.pow(n,3);
        System.out.println(ans);
    }
}
