import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i * 1000 >= N) {
                System.out.println(i * 1000 - N);
                return;
            }
        }
    }

}
