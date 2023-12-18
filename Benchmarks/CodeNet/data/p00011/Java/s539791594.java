import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int ar[] = new int[w];
        int n = sc.nextInt();
        for (int i = 0; i < w; i++)
            ar[i] = i + 1;
        for (int i = 0; i < n; i++) {
            String buf = sc.next();
            String buf2[] = buf.split(",");
            int a = Integer.parseInt(buf2[0]) - 1, 
                b = Integer.parseInt(buf2[1]) - 1;
            int tmp = ar[a];
            ar[a] = ar[b];
            ar[b] = tmp;
        }
        
        for (int i = 0; i < w; i++) {
            System.out.printf("%d\n", ar[i]);
        }
    }
  
}
