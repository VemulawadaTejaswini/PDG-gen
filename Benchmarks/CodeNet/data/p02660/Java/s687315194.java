import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        long n = sc.nextLong();
        long nt = n;
        List<Integer> pmList = primeNumber((int)Math.sqrt(n) + 1);
        int len = pmList.size();
        for(int i = 0; i < len; i++) {
            long nm = pmList.get(i);
            for(int j = 2; Math.pow(nm, j) < (int)Math.sqrt(n) + 1; j++) {
                pmList.add((int)Math.pow(nm, j));
            }
        }
        Collections.sort(pmList);
        for(int p : pmList) {
            if(nt % p ==0) {
                res++;
                nt /= p;
            }
        }
        if(n != 1 && res == 0) res++;
        System.out.println(res);
    }
    static List<Integer> primeNumber(int number) {
        boolean isPrime = false;
        List<Integer> pmList = new ArrayList<>();
        pmList.add(2);
        pmList.add(3);

        for(int i = 5; i <= number; i+= 2) {
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime) {
                pmList.add(i);
            }
        }
        return pmList;
    }
}
