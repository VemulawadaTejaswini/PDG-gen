import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long t[] = new long[5];
        t[0]=Long.parseLong(sc.next());
        long min = t[0];
        for(int i=1; i<5; i++) {
            t[i]=Long.parseLong(sc.next());
            if(min > t[i]) min = t[i];
        }
        long m;
        if(N % min == 0) m = N / min + 4;
        else m = N / min + 5;
        System.out.println(m);
    } 
    
}