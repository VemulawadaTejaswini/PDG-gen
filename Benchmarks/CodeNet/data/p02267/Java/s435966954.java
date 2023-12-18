package com.wildmouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> s = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        sc.nextLine();
        int c = (int)Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(q -> linearSearch(s, q))
                .count();
        System.out.println(c);
    }

    public static boolean linearSearch(List<Integer> ss, Integer target) {
        for (Integer s: ss) {
            if (s.equals(target)) {
                return true;
            }
        }
        return false;
    }
}


