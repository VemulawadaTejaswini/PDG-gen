import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (int) Math.ceil(n / 1.08);
        if ((int)Math.floor((double)x * 1.08) == n) {
            System.out.println(x);
        } else {
            System.out.println(":(");
        }
    }
}