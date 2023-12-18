import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;

        S = sc.nextLine();

        S = S.replaceAll(".", "x");

        System.out.println(S);
    }
}