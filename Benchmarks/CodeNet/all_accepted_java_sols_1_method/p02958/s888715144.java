import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] p = new int[N];
        for(int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        
        int sw = 0;
        int w = 0;
        for(int i = 0; i < N-1; i++) {
            int min = p[i];
            int minidx = i;
            for(int j = i + 1; j < N; j++) {
                if(min > p[j]) {
                    min = p[j];
                    minidx = j;
                }
            }
            if(minidx != i) {
                w = p[i];
                p[i] = min;
                p[minidx] = w;
                sw++;
            }
        }
        
        if(sw <= 1) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
    }
}