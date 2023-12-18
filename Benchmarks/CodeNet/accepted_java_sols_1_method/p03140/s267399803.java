//package AtCoder.Nekkei;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] arr = new char[3][n];
        for (int i = 0; i < 3; i++) {
            String str = s.next();
            arr[i] = str.toCharArray();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
//            TreeSet<pair> set = new TreeSet<>();
//            if(set.)
//            set.add(new pair())
            HashSet<Character> set = new HashSet<>();
            set.add(arr[0][i]);
            set.add(arr[1][i]);
            set.add(arr[2][i]);

            sum += set.size() - 1;
        }
        System.out.println(sum);


    }


}