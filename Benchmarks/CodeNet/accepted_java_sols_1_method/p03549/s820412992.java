import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int time = m * 1900 + (n - m) * 100;
        System.out.println(time * (int)Math.pow(2, m));
    }
}