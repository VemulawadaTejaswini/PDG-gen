import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String length = scan.nextLine();
        String str2 = scan.nextLine();
        String[] s = str2.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        String aaa= "";
        for (int i = 0; i < Integer.parseInt(length); i++) {
            stringBuilder.append(s[0].charAt(i));
            stringBuilder.append(s[1].charAt(i));

        }
        System.out.println(stringBuilder.toString());
    }
}