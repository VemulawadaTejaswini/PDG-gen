import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB, numC;
        int count = 0;

        numA = Integer.parseInt(scan.next());
        numB = Integer.parseInt(scan.next());
        numC = Integer.parseInt(scan.next());

        for (int i = numA; i < numB + 1 ; i++) {
            if (numC % i == 0) count++;
        }

        System.out.println(count);
    }
}

