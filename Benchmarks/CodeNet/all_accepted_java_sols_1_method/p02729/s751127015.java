import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int nSum = (N * (N-1)) / 2;
        int mSum = (M * (M-1)) / 2;
        System.out.println(nSum + mSum);

    }
}