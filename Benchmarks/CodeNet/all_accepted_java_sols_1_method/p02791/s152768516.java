import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int min = sc.nextInt();
        int[] p = new int[N];
        p[0] = min;
        
        for(int i = 1; i < N; i++) {
            p[i] = sc.nextInt();
            if(min >= p[i]) {
                count++;
                min = p[i];
            }
        }
        
        System.out.println(count);
        
    }
}