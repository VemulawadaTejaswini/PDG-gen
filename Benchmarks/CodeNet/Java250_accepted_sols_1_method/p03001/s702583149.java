import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        
        int ans = (x == W/2 && y == H/2) ? 1 : 0;
        
        System.out.print(W * H / 2);
        System.out.print(" ");
        System.out.println(ans);
    }
}
