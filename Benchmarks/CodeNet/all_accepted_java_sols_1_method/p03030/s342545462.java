import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    // static final int modnum = 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // sc.next();
        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            String next = sc.next();
            // System.out.println(next);
            int nextInt = sc.nextInt();
            // System.out.println(next+"  "+nextInt);
            list[i] = next+" "+(200-nextInt)+" "+(i+1);
            // sc.next();
        }

        Arrays.sort(list, Comparator.naturalOrder());

        for (int i = 0; i < N; i++) {
            // System.out.println(list[i]);
            System.out.println(list[i].split(" ")[list[i].split(" ").length-1]);
        }
    }
}