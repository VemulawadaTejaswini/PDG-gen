import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int w = Integer.parseInt(scanner.nextLine());

        int i = 0;
        StringBuilder builder = new StringBuilder();
        while (i < S.length()) {
            builder.append(S.charAt(i));
            i += w;
        }
        System.out.println(builder);
    }
}