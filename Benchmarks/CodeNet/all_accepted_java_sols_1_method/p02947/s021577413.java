import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            char[] ca = sc.next().toCharArray();
            Arrays.sort(ca);
            strArray[i] = String.valueOf(ca);
        }
        sc.close();
        Arrays.sort(strArray);

        int count = 0;
        long res = 0;
        String before = "";
        String current = "";
        for (String str : strArray) {
            before = current;
            current = str;
            if (before.equals(current)) {
                count++;
                res += count;
            } else {
                count = 0;
            }
        }

        System.out.print(res);
    }
}
