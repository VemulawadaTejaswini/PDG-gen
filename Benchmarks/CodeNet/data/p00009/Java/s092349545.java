import java.util.Scanner;

public class Main {

    public static int maxSize = 1000000;

    public static boolean[] prime = new boolean[maxSize];

    public static void main(String[] args) {
        setPrime();
        try (Scanner scan = new Scanner(System.in)) {
            String inData = "";
            while ((inData = scan.nextLine()) != null) {
                System.out.println(primeCount(Integer.parseInt(inData)));
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }

    private static void setPrime() {
        prime[2] = true;
        for (int i = 3; i < maxSize; i++) {
            if (i % 2 == 0) {
                continue;
            }
            setOddPrime(i);
        }
    }

    private static void setOddPrime(int i) {
        boolean isPrime = true;
        for (int j = 1; j <= Math.sqrt(i); j++) {
            if (prime[j] && i % j == 0) {
                isPrime = false;
                break;
            }
        }
        prime[i] = (isPrime) ? true : false;
    }

    private static int primeCount(int inData) {
        int count = 0;
        for (int i = 2; i <= inData; i++) {
            if (i != 2 && i % 2 == 0) {
                continue;
            }
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }
}