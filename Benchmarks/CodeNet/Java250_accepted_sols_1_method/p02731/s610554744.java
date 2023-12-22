import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int taiseki = sc.nextInt();
        double taiseki2 = (double)taiseki;
        double ans = taiseki2/3;
        double ans2 = ans * ans * ans;
        System.out.println(ans2);
    }
}
