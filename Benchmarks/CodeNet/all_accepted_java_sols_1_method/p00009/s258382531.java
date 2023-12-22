import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrimes = new boolean[1000000];
        for (int x = 2; x < 1000000 / 2 + 1; x++) {
            if (!isPrimes[x]) {
                for (int y = 2; y < 999999 / x + 1; y++) {
                    isPrimes[x * y] = true;
                }
            }
        }

        int count = 0;
        int[] nPrimes = new int[1000000];
        for (int i = 2; i < 1000000; i++) {
            if (!isPrimes[i]) {
                count++;
            }
            nPrimes[i] = count;
        }

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(nPrimes[n]);
        }
    }
}