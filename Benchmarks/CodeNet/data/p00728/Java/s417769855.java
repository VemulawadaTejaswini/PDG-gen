import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int sum = 0;
            int max = -1;
            int min = 1001;
            for(int i = 0; i < n; i++) {
                int s = sc.nextInt();
                if(s > max) max = s;
                if(s < min) min = s;
                sum += s;
            }

            System.out.println((sum - max - min) / (n - 2));
        }
    }
}
