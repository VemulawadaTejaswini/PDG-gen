import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();

        int min = D / S;


        if (min < T) {
            System.out.println("Yes");
        } else if (min == T) {

            if (D % S == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}