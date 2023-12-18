import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if(S.charAt(S.length() - 1) != 's') {
            System.out.print(S + "s");
        } else {
            System.out.print(S + "es");
        }
    }
}

