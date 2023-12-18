import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int[] list = new int[27];
        for (char c : w.toCharArray()) {
            list[c - 'a']++;
        }

        for (int i : list) {
            if (i % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}