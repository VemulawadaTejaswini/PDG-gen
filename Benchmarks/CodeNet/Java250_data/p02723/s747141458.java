import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(problem160a(s));
    }

    private static String problem160a(String s) {
        return (equal(s, 2, 3) && equal(s, 4, 5)) ? "Yes" : "No";
    }

    private static boolean equal(String s, int at1, int at2) {
        return s.charAt(at1) == s.charAt(at2);
    }
}