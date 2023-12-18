import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; R * i <= n; i++) {
            for (int j = 0; R * i + G * j <= n; j++) {
                int val = R * i + G * j;
                int diff = n - val;
                if (diff % B == 0) count++;
            }
        }
        System.out.println(count);
    }
}