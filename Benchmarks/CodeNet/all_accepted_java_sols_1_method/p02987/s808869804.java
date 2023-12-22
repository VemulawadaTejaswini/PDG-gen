import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] lis = new char[256];

        for (int i = 0; i < 4; ++i) {
            lis[s.charAt(i)] += 1;
        }
        for (int i = 0; i < 256; ++i) {
            if (lis[i] != 0 && lis[i] != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

