import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxH = 0;
        int result = 0;
        for(int i=0; i<n; i++) {
            int h = in.nextInt();
            if(h >= maxH) {
                result++;
            }
            maxH = Math.max(maxH, h);
        }
        System.out.println(result);
    }
}
