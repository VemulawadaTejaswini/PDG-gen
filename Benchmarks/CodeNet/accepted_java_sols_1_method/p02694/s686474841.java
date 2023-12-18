import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        double k = 100.0;
        int cnt = 0;
        while(X > k){
            k *= 1.01;
            k = (long)k;
            cnt++;
        }
        System.out.println(cnt);
    }
}
