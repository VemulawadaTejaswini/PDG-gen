import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashSet <Long> S = new HashSet <Long>();
        for (long i = 0; i < n; i++){
            S.add(sc.nextLong());
        }
        long q = sc.nextLong();
        long c = 0;
        for (long i = 0; i < q; i++){
            if (S.contains(sc.nextLong())){
                c++;
            }
        }
        System.out.println(c);
    }
}