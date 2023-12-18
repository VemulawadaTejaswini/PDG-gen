import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // String str2 = scan.nextLine();
        String[] s = str.split(" ");
        String s1 = s[1] + s[0];

        System.out.println(s1);
    }
}