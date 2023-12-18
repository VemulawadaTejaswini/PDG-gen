import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
    	Scanner scan = new Scanner(System.in);
    	int inputs = scan.nextInt();
    	int accumulate = 0;
        boolean[] isPrime = new boolean[inputs + 1];
        for (int i = 2; i <= inputs; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i*i <= inputs; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= inputs; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        for (int i = 2; i <= inputs; i++) {
            if (isPrime[i]) accumulate++;
        }
        System.out.println(accumulate);
    }
}