import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                ans.append(Character.toUpperCase(S.charAt(i)));
            } else {
                ans.append(S.charAt(i));
            }
        }
        System.out.println(ans.toString());
    }
}