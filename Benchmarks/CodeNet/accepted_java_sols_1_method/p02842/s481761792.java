import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= 50000 ; i++) {
            if (i * 108 / 100 == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }

}
