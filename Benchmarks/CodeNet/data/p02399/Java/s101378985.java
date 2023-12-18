import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB;

        numA = Integer.parseInt(scan.next());
        numB = Integer.parseInt(scan.next());

        System.out.print(numA / numB + " ");
        System.out.print(numA % numB + " ");
        System.out.println((double)numA / (double)numB);
    }
}

