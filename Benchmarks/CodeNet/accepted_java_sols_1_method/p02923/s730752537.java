import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (h[i + 1] <= h[i]) {
                count++;
                if (count >= max)
                    max = count;
            } else {
                count = 0;
            }

        }
        System.out.println(max);
    }
}