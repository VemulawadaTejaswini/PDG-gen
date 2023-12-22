import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int p = 0;
        while (((int) Math.pow(k, p)) <= n) {
            p++;
        }
        System.out.println(p);
    }
}