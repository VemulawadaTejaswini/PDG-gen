import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("/");
        if (Integer.parseInt(s[0]) >= 2019
                && Integer.parseInt(s[1]) >= 5) {
            System.out.println("TBD");
            return;
        }
        System.out.println("Heisei");
    }

}
