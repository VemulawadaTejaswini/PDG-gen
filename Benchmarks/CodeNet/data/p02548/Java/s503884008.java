/*
    Author: Anthony Ngene
    Created: 19/09/2020 - 13:12
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        int last = n;
        for (int i = 1; i < n; i++) {
            while (i * last >= n) last--;
            if (last == 0) break;
            ans += last;
        }
        System.out.println(ans);
    }
}
