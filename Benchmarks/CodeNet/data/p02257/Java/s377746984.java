import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    
    public boolean isPrime(int n){
        if (n == 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args){



        Main pn = new Main();

        Scanner sc = new Scanner(System.in);

        List prime = new ArrayList();

        int ans = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (pn.isPrime(n) && !prime.contains(n)) {
                prime.add(n);
                ans++;
            }
        }
        //int[] numbers = new int[]{11,7,8,9,10,11,12,13,14,15,16,17};


        System.out.println(ans);
    }
}

