import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        s[3] = '8';

        String output = new String(s);
        System.out.println(s);
        sc.close();
    }
}
