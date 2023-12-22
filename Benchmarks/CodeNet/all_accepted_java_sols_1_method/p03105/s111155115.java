import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        final Scanner lineScanner = new Scanner(System.in);
        final int cost = lineScanner.nextInt();
        final int sum = lineScanner.nextInt();
        final int satisfiedCount = lineScanner.nextInt();

        int needCost = cost * satisfiedCount;

        if (needCost <= sum){
            System.out.println(satisfiedCount);
        } else {
            System.out.println(sum / cost);
        }
    }
}