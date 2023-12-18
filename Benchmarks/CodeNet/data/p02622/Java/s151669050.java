import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int count = 0;
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                s1.replace(s1.charAt(i), s2.charAt(i));
                count++;
            }
        }
        System.out.println(count);

    }
}