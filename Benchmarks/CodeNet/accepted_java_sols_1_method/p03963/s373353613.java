import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int ways = (int) (Math.pow((K-1), N-1)* K);

        System.out.println(ways);
    }
}