import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();


        if(a+1 >= b){
            System.out.println(k+1);
            return;
        }
        if(k-2<a-1){
            System.out.println(k+1);
            return;
        }

        k -= a-1;
        long n = k/2;
        System.out.println(n*(b-a)+a+k%2);
    }
}