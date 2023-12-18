import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        char[] str = S.toCharArray();

        int count = 0;
        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] == str[str.length - 1 - i]) {
                continue;
            } else {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}