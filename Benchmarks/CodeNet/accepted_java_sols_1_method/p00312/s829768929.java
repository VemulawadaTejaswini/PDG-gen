import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int D = sc.nextInt();
            int L = sc.nextInt();
            System.out.println(D / L + (D % L));
        }
    }
}

