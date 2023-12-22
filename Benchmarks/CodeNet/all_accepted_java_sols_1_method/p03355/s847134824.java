import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int K = sc.nextInt();
        Set<String> substrings = new HashSet<>();
        for(int i=0; i<N; i++) for(int l=1; l<=Math.min(N-i, K); l++) {
            substrings.add(S.substring(i,i+l));
        }

        String[] a = substrings.toArray(new String[0]);
        Arrays.sort(a);
        System.out.println(a[K-1]);
    }
}
