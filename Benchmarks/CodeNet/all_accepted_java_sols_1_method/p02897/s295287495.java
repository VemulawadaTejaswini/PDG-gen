import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      double probability = (double) (N - ( N / 2 ));

      System.out.print( probability / 1.0 / N );

    }
}