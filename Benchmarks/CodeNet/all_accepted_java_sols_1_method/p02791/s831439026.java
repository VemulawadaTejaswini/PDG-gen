import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) p[i] = scan.nextInt();
        int out = 1;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            min = Math.min(min, Math.min(p[i], p[i - 1]));
            if(min >= p[i]) out++;
        }
        System.out.println(out);
        scan.close();
    }
}