import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (min >= x) {
                count++;
                min = x;
            } 
        }
        System.out.println(count);
    }
}