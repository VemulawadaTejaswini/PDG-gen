import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float x = sc.nextFloat();
        int t = sc.nextInt();
        int ans = (int)(Math.ceil(n/x))*t;
        System.out.println(ans);
    }
}