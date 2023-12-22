import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        S = "2018" + S.substring(4,10);
        System.out.println(S);
    }

}