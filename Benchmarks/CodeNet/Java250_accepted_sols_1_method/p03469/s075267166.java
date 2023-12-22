import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        String s = sc.next().replace("2017", "2018");
        System.out.println(s);
        sc.close();
    }

}