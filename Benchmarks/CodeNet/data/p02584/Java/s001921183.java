import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();

        if(x >= k * d){
            System.out.println(x - k * d);
            return;
        }

        k -= x / d;
        x -= x / d * d;

        if(k % 2 == 0){
            System.out.println(Math.abs(x));
        }else{
            System.out.println(Math.abs(x - d));
        }

    }
}
