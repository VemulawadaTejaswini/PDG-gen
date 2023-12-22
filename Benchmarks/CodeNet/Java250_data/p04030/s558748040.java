import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuffer buffer = new StringBuffer();
        int position = -1;
        for (char c : s.toCharArray()) {
            if (c == 'B') {
                if (buffer.length() != 0) {
                    buffer.deleteCharAt(position--);
                }
            } else {
                buffer.insert(++position, c);
            }
        }
        System.out.println(buffer);
    }
}