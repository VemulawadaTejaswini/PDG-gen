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
        String s = sc.next();
        int count = 0;
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - 1 - i)) {
//                System.err.println(String.format("i=%d [%s], rev_i=%d [%s]", i, s.charAt(i), l - 1 - i, s.charAt(l - 1 - i)));
                count++;
            }
        }
        System.out.println(count);
    }
}
