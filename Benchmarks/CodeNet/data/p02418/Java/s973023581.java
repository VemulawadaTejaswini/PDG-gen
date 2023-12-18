import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String p = scan.nextLine();

        s += s;

        if (s.contains(p)) System.out.println("Yes");
        else System.out.println("No");
    }
}