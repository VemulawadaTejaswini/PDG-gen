import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String jo[] = {"pon", "pon", "hon", "bon", "hon", "hon", "pon", "hon", "pon", "hon"};

        System.out.println(jo[n % 10]);
    }
}