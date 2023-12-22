import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        sb.setCharAt(3, '8');

        System.out.println(sb);
    }
}