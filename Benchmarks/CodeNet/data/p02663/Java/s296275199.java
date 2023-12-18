import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        
        int h1 = Integer.parseInt(sc.next());
        int m1 = Integer.parseInt(sc.next());
        int h2 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int H = h2 - h1;
        int M = 0;
        if(m1 <= m2) {
            M = m2 - m1;
        }else {
            H--; 
            M = (60-m1) + m2;
        }
        int ans = H * 60 + M - k;
        System.out.println(ans);
    }   
}
