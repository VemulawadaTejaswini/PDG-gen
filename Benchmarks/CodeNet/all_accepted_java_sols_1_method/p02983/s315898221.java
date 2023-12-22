import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if (r - l >= 2018) {
            System.out.println(0);
            return;
        }
        
        int min = 2000000000;
        for (int i = l; i < r; i++) {
            for (int j = l + 1; j <= r; j++) {
                int tmp = i % 2019;
                int tmp2 = j % 2019;
                min = Math.min(min, ((int)tmp*tmp2)%2019);
            }
        }
        System.out.println(min);
    }
}