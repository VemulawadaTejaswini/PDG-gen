import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (sc != null) {
            sc.close();
        }
        int a = (n + 1) / 2;
        System.out.println((double) a / n);
    }

}