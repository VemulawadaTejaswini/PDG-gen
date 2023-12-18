
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] S = str.toCharArray();
        HashSet<Character> hs1 = new HashSet<Character>();
        HashSet<Character> hs2 = new HashSet<Character>();
        HashSet<Character> hs3 = new HashSet<Character>();
        
        int ans=0;
        for (int i = 0; i < N; i++) {
            if(hs1.add(S[i])){
                hs2.clear();
                for (int j = i+1; j < N; j++) {
                    if(hs2.add(S[j])){
                        hs3.clear();
                        for (int k = j+1; k < N; k++) {
                            hs3.add(S[k]);
                        }
                        ans+=hs3.size();
                    }
                }
            }
        }
        System.out.println(ans);
    }
}