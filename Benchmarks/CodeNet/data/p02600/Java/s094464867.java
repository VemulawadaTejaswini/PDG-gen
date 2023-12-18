import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 8 - (n - 400) / 200;
        System.out.println(ans);
    }
}
