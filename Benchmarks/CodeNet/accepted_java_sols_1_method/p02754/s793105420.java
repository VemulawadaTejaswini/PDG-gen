import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long res = 0;

        long div = n / (a+b);
        res = div * a;
        res += Math.min(n % (a+b), a);

        System.out.println(res);
    }



}
