import java.util.*;

/**
 * C
 */
public class Main {
    public static void main(String[] args) {
        
        int prime = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int num : array) {
            if(isPrime(num) == true) {
                prime++;
            }
        }

        /*IN : for (int num : array) {
            for (int j = 2; j<num; j++) {
                if (num % j == 0) {
                    continue IN;
                }
            }
            prime++;
        }
        
        これでだめだったから悲しいよなぁ。。。

        */

        System.out.println(prime);

    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                // 素数ではない
                return false;
            }
        }

        // 素数である
        return true;
    }
}
