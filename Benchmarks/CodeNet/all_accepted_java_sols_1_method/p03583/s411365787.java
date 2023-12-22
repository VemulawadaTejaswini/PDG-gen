import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        // 4/N=1/h+1/n+1/w
        // 4hnw = Nnw + Nhw + Nhn
        // 4hnw - Nnw - Nhw = Nhn
        // w*(4hn - Nn - Nh) = Nhn
        
        for (long h = 1; h <= 3500; h++) {
            for (long n = 1; n <= 3500; n++) {
                long left = 4*h*n - N*n - N*h;
                long right = N*h*n;
                
                if (left == 0) continue;
                if (left < 0 || right < 0) continue;
                
                if (right % left == 0) {
                    long w = right / left;
                    System.out.println(h + " " + n + " " + w);
                    return;
                }
            }
        }
    }
}
