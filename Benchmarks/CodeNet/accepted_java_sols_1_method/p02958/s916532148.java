import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            if (p != i) {
                counter++;
            }
        }
        sc.close();

        if (counter <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
