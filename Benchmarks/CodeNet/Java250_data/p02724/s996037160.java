import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        
        int ans = 0;
        ans += (X/500)*1000;
        X %= 500;
        ans += (X/5)*5;
        System.out.println(ans);
    }
}
