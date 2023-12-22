import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rank = new int[9];
        for(int n=0; n<N; n++){
            int a = sc.nextInt();
            if(a>=3200) rank[8]++;
            else rank[a/400]++;
        }
        int fixedColor = 0;
        for(int i=0; i<=7; i++) fixedColor += (rank[i]>0 ? 1 : 0);
        if(fixedColor==0) System.out.printf("%d %d\n", 1, rank[8]);
        else System.out.printf("%d %d\n", fixedColor, fixedColor+rank[8]);
    }
}
