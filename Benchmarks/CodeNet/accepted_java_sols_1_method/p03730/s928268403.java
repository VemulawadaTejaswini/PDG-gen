import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long now = 0;
        HashSet<Long> hs = new HashSet<>();
        while(c != now){
            now += a;
            now %= b;
            if(hs.contains(now)){
                System.out.println("NO");
                return;
            }else{
                hs.add(now);
            }
        }
        System.out.println("YES");
    }
}
