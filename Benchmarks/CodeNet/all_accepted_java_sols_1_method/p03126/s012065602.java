//package Beginner118;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(s.nextInt());
        }
        for (int i = 1; i < n; i++) {
            k = s.nextInt();
            HashSet<Integer> set1 = new HashSet<>();
            for (int j = 0; j < k; j++) {
                set1.add(s.nextInt());
            }
            set.retainAll(set1);
        }
        System.out.println(set.size());
    }
}
