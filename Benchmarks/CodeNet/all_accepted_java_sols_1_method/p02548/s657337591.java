import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1 ; i < n ; i++) {
            c += (n - 1) / i;
        }
        System.out.println(c);

    }

}
