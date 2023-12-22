import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0) break;
            int s = 0;
            int max = 0;
            int min = 1000;
            for(int i=0; i<n; i++) {
                int t = sc.nextInt();
                s += t;
                max = Math.max(t, max);
                min = Math.min(t, min);
            }
            System.out.println((s-max-min) / (n-2));
        }
    }
}

