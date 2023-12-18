/**
 * TODO: delete this line
 */


import java.util.Scanner;

/**
 * TODO: Rename to Main
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();

        int l = S.length();
        for (int i = 0; i < l; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(S.charAt(l - 1))
                    .append(S, 0, l - 1);
            if (builder.toString().equals(T)){
                System.out.println("Yes");
                return;
            }
            S = builder.toString();
        }
        System.out.println("No");
    }
}