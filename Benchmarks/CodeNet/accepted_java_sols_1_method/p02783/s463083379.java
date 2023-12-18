import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long A = sc.nextLong();
        sc.close();

        long count = 0;
        while (true) {
            H -= A;
            count++;
            if (H <= 0) {
                break;
            }
        }

        System.out.println(count);
    }

}