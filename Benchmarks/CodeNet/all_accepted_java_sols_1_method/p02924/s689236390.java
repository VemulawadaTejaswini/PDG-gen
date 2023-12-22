import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long ret = (n * (n - 1)) / 2;
        System.out.println(ret);
    }
}
