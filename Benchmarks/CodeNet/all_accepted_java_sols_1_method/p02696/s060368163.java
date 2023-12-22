import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        if(b == 1){
            System.out.println(0);
        }else if(b-1 <= n){
            System.out.println((a*(b-1)/b) - a*((b-1)/b));
        }else{
            System.out.println((a*n/b) - a*(n/b));
        }
    }
}