import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    boolean isPrime(int n){
        if (n == 2) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Main pn = new Main();
        List prime = new ArrayList();
        int ans = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (pn.isPrime(n) && !prime.contains(n)) {
                prime.add(n);
                ans++;
            }
        }


        System.out.println(ans);
    }
}

