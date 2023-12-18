import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sout = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
//                c = Character.toUpperCase(c);
                c = (char)(c - 'a' + 'A');
            } else if ('A' <= c && c <= 'Z') {
//                c = Character.toLowerCase(c);
                c = (char)(c - 'A' + 'a');
            } else {
                // nop
            }
            sout = sout + c;
        }
        System.out.println(sout);
    }
}
