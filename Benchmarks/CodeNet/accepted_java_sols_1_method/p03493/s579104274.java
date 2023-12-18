import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = a%10 + (a/10)%10 + a/100;
        System.out.println(ans);
    }
}
