import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        HashSet<Long> hash = new HashSet<>();
        for (int i=0;i<n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (!hash.contains(x*53+y*73)){
                hash.add(x*1723+y*853);
                if (Math.sqrt(x*x+y*y)<=d)ans++;
            }
        }
        System.out.println(ans);
    }
}
