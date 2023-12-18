import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] S = new String[N];
        for(int n=0;n<N;n++) S[n]=sc.next();
        Arrays.sort(S);
        for(int n=0;n<N;n++) System.out.print(S[n]);
        System.out.println();
    }
}