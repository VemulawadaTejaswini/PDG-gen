import java.util.Scanner;

class Main {

    boolean isPrime(int n){

        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Main pn = new Main();
        
        
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (pn.isPrime(a)) System.out.println(a);
        }

    }
}

