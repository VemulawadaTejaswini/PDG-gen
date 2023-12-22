import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        boolean ans = false;

        while(!(ans)) {
            if(PrimeNumber(X)) {
                ans = true;
                System.out.println(X);
            }
            X++;
        }
    }

    private static boolean PrimeNumber(int X) {
        for(int i = 2; i < X/2; i++) {
            if(X % i == 0){
                return false;
            }
        }
        return true;
    }
}