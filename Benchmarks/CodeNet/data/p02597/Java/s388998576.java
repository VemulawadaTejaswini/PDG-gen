import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String str = s.next();
        char[] c = str.toCharArray();
        int size = c.length;
        int count = 0;
        int Count = 0;
        for (char value : c) if (value == 'W') count++;
        if (count <= size - count) {
            for (int i = 0; i < count; i++) {
                if (c[i] == 'W') Count++;
            }
        } else {
            for (int i = 0; i < size - count; i++) {
                if (c[size - i - 1] == 'R') Count++;
            }
        }
        System.out.println(Count);
    }
}