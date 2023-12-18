import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> countPrimeFactor = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            int num = i;
            while(num > 1) {
                for(int j = 2; j <= num; j++) {
                    if(num % j == 0) {
                        countPrimeFactor.put(j, countPrimeFactor.getOrDefault(j, 0) + 1);
                        num /= j;
                        break;
                    }
                }
            }
        }
        long count = 1;
        long mod = 1000000007;
        for(int primeNum: countPrimeFactor.values()) {
            count *= (primeNum + 1);
            count %= mod;
        }
        System.out.println(count);
    }

}
