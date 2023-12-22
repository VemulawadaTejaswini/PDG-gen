import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String T = scan.nextLine();

        System.out.println(S.equals(T.substring(0,S.length())) ? "Yes" : "No");
        scan.close();
    }

}