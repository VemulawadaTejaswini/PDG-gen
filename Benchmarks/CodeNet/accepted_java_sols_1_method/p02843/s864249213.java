import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int w = x % 100;
        int ans = 1;
        int check = w / 5;
        if (w % 5 != 0)
            check++;
        if (check > x / 100)
            ans = 0;
        System.out.println(ans);
    }
}