import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] sarr = sc.next().split(",");
            int[] x = new int[15];
            for(int i=0;i<12;i++) {
                x[i] = Integer.valueOf(sarr[i]);
            }
            int v = x[10];
            int v2 = x[11];
            for(int i=1;i<10;i++) {
                x[i] += x[i-1];
            }
            for(int i=0;i<10;i++) {
                if (x[9]*v<=x[i]*(v+v2)) {
                    System.out.println(i+1); break;
                }
            }
        }
    }
 
}