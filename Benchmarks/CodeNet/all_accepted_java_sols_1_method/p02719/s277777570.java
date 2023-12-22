import java.util.*;
public class Main {//ここが Main になっている
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long N = Long.parseLong(sc.next());
        Long K = Long.parseLong(sc.next());
        Long next_n;
        Long t = N % K;
        Long k_t = K - t;
        if (t<k_t){
            System.out.println(t);
        }
        if (t>=k_t){
            System.out.println(k_t);
        }
    }
}
