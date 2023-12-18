
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int input = n;
        List<Integer> primeList = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
                primeList.add(i);
            }
        }
        if (n > 1) {
            primeList.add(n);
        }

        System.out.print(input + ":");
        for (int prime : primeList) {
            System.out.print(" ");
            System.out.print(prime);
        }
        System.out.println("");
    }

}

