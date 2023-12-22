import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int counter = 0;
        int length = chars.length;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[length - 1 - i]) {
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}