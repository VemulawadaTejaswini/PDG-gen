import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String a = sc.nextLine();
        if (s.contains(a)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

    }
}