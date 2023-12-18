import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Collections;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];

        Set<String> set =new HashSet<String>();
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
            set.add(S[i]);
        }

        System.out.println(set.size());
    }

}