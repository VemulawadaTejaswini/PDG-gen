import java.util.*;

public class Main {
    static private Scanner sc = new Scanner(System.in);
    static int n = 0;
    static ArrayList<Integer> a = new ArrayList<>(20000);
    static ArrayList<Integer> b = new ArrayList<>(20000);
    
    public static void main(String[] args) {
        n = sc.nextInt();
        for(int i = 1; i <= n; ++i) {
            a.add(sc.nextInt());
            b.add(a.get(i - 1) - i);
        }
        
        Collections.sort(b);
        
        long median = (n % 2 == 1) ? b.get(n / 2) : b.get(n / 2) + (b.get(n / 2 - 1) - b.get(n / 2)) / 2;
        long ans = 0;
        for(int i = 0; i < n; ++i) {
            ans += Math.abs(b.get(i) - median);
        }
        System.out.println(ans);
    }
}
