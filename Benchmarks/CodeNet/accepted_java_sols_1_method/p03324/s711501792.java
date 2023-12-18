
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();

        if (N == 100) {
            System.out.println((int) Math.pow(100, D) * 101);
        } else {
            System.out.println((int) Math.pow(100, D) * N);
        }

    }

}