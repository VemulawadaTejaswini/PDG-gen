import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        for(int i = n; i > 0; i--) {
            int count = 0;
            int num = i;
            while(num < k) {
                num *= 2;
                count++;
            }
            double temp = 1;
            for(int j = 0; j < count; j++) {
                temp *= (0.5);
            }
            sum += temp;
        }
        double extra = 0;
        if(n > k) extra += (k/n);
        System.out.println(sum / n + extra);
    }
}
