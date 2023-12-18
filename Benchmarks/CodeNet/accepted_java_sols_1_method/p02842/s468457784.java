import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (int) Math.ceil(n / 1.08);
        if ((int) (x * 1.08) == n) {
            System.out.println(x);
            return;
        }
        System.out.println(":(");
    }

}
