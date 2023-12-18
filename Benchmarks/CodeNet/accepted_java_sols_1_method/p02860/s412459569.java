import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n % 2 != 0) {
            System.out.println("No");
            return;
        }

        char[] chars = s.toCharArray();
        int half = s.length() / 2;
        for (int i = 0; i < half; i++) {
            if (chars[i] != chars[i + half]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
