import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        System.out.println(String.valueOf(first) + (s.length() - 2) +String.valueOf( last));

    }

}