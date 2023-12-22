import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        char[] charArray = s.toCharArray();

        if (charArray[k - 1] == 'A') {
            charArray[k - 1] = 'a';
        } else if (charArray[k - 1] == 'B') {
            charArray[k - 1] = 'b';
        } else {
            charArray[k - 1] = 'c';
        }

        System.out.println(String.valueOf(charArray));
    }
}
