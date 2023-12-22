import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S_1 = sc.next();
        String S_2 = sc.next();
        String S_3 = sc.next();
        System.out.println(String.valueOf(S_1.charAt(0)).toUpperCase()
                + String.valueOf(S_2.charAt(0)).toUpperCase()
                + String.valueOf(S_3.charAt(0)).toUpperCase() );

    }
}
