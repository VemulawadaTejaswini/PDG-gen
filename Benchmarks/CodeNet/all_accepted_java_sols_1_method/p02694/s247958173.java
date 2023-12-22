import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long money = 100;
        long X = s.nextLong() ;
        int count = 0;

        while(money<X){
            money = (long)Math.floor(money*1.01);
            count++;
        }

        System.out.println(count);

    }


}
