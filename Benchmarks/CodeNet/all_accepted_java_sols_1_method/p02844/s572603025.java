import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = sc.next();
        int ans = 0;
        for(int i = 0; i < 1000; i++){
            String c100 = String.valueOf(i/100);
            String c10 = String.valueOf((i%100)/10);
            String c1 = String.valueOf(i%10);
            int a = s.indexOf(c100);
            if(a == -1) continue;
            int b = s.indexOf(c10,a+1);
            if(b == -1) continue;
            int c = s.indexOf(c1,b+1);
            if(c == -1) continue;
            ans++;
        }
        System.out.println(ans);
    }
    
}
