import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        int result = x;

        for (int i=1; i <= 10; i++){

            result = r * result - D;

            System.out.println(result);
        }
    }
}