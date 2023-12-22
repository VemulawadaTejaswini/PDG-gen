import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, s;
        while((n = scan.nextInt()) != 0) {
            int max = 0, min = 1000, sum = 0;
            for(int i = 0; i < n; i++) {
                s = scan.nextInt();
                sum += s;
                if(s > max) max = s;
                if(s < min) min = s;
            }
            System.out.println((sum - max - min)/(n - 2));
        }
    }
}
