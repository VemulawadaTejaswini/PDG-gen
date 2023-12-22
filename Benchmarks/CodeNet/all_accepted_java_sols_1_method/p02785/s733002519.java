//package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            a.add(val);
        }
        Collections.sort(a, Collections.reverseOrder());
        long ans = 0;
        for (int i = k; i < n; i++)
            ans += a.get(i);
        System.out.println(ans);
    }
}
