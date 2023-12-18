import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        HashSet<Double> hash = new HashSet<>();
        for (int i=0;i<n;i++){
            long x = sc.nextInt();
            long y = sc.nextInt();
            if (!hash.contains(x*2647D+y*4021D)){
                hash.add(x*2647D+y*4021D);
                if (Math.sqrt(x*x+y*y)<=d)ans++;
            }
        }
        System.out.println(ans);
    }
}
