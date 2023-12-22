import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (String s : S.split("")) {
            if (Character.isLowerCase(s.charAt(0))) {
                System.out.print(Character.toUpperCase(s.charAt(0)));
            } else if (Character.isUpperCase(s.charAt(0))) {
                System.out.print(Character.toLowerCase(s.charAt(0)));
            } else {
                System.out.print(s);
            }
        }
        System.out.println();
    }
}