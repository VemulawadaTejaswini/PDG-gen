import  java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();
        int A = cin.nextInt();
        int B = cin.nextInt();
        int C = cin.nextInt();
        Integer[] a = new Integer[A];
        Integer[] b = new Integer[B];
        Integer[] c = new Integer[C+x+y];
        for(int i = 0; i < A; i++){
        	a[i] = cin.nextInt();
        }
        Arrays.sort(a, 0, A, Collections.reverseOrder());
        for(int i = 0; i < B; i++){
        	b[i] = cin.nextInt();
        }
        Arrays.sort(b,0,B,Collections.reverseOrder());
        
        for(int i = 0; i < C; i++){
        	c[i] = cin.nextInt();
        }
        for(int i = C; i < C+x; i++){
        	c[i] = a[i-C];
        }
        for(int i = C+x; i < C+x+y; i++){
        	c[i] = b[i-C-x];
        }
        Arrays.sort(c,0,C+x+y,Collections.reverseOrder());
        
        long ans = 0;
        for(int i = 0; i < x+y; i++){
        	ans += c[i];
        }
        
        System.out.println(ans);
    }
}