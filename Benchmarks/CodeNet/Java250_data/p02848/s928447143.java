import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int newCharInt = chars[i] + N;
            if (newCharInt >= (int)'Z' + 1) {
                newCharInt -= 'Z' - 'A' + 1;
            }
            System.out.print((char) newCharInt);
        }
    }
}
