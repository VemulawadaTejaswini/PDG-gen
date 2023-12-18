import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] snuke = new int[N];
        Arrays.fill(snuke, 0);

        for(int k=0; k<K; k++){
            int D = sc.nextInt();
            for(int d=0; d<D; d++){
                int a = sc.nextInt()-1;
                snuke[a]++;
            }
        }

        int trick = 0;
        for(int s: snuke) if(s==0) trick++;
        System.out.println(trick);
    }
}
