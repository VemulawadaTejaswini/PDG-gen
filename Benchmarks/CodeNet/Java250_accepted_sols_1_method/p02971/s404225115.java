import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        
        int max = 0;
        int maxidx = 0;
        int secmax = 0;
        int secmaxidx = 0;
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
            if(A[i] > max) {
                max = A[i];
                maxidx = i;
            }
        }
        
        for(int i = 0; i < N; i++) {
            if(i == maxidx) {
                continue;
            }
            if(A[i] > secmax) {
                secmax = A[i];
                secmaxidx = i;
            }
        }
        
        for(int i = 0; i < N; i++) {
            if(i == maxidx) {
                System.out.println(secmax);
            }else {
                System.out.println(max);
            }
        }
    }
}