import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        /*
        * assume that we have the list of 2-digit lunlun numbers({10,11,12,21,...,89,98,99}).
        * we can get the list of 3-digit lunlun numbers with this procedure:
        * for each 2-digit lunlun numbers N, add N ^ (N%10 +- 1)
        * [^ means string-concat]
        * */

        ArrayList<Long> lunluns = new ArrayList<>(120000);
        for(long i=1; i<=9; i++) lunluns.add(i);
        for(int n=0; n<100000; n++){
            if(lunluns.get(n)%10 > 0) lunluns.add(lunluns.get(n) * 10 + lunluns.get(n)%10 - 1);
            lunluns.add(lunluns.get(n) * 10 + lunluns.get(n)%10);
            if(lunluns.get(n)%10 < 9) lunluns.add(lunluns.get(n) * 10 + lunluns.get(n)%10 + 1);
        }
        System.out.println(lunluns.get(K - 1));
    }
}
