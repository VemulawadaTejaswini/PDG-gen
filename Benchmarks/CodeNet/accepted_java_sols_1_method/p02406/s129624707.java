import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int n, i;

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        n = Integer.parseInt(buf);
        
        
        for (i = 1;i <= n;i++) {
            if (i % 3 == 0) System.out.printf(" %d", i);
            else if (i % 10 == 3) {
                System.out.printf(" %d", i);
            }
            else if (i / 10 > 0 && (i / 10) % 10 == 3) {
                System.out.printf(" %d", i);
            }
            else if (i / 100 > 0 && (i / 100) % 10 == 3) {
                System.out.printf(" %d", i);
            }
            else if (i / 1000 > 0 && (i / 1000) % 10 == 3) {
                System.out.printf(" %d", i);
            }
            else if (i / 10000 > 0 && (i / 10000) % 10 == 3) {
                System.out.printf(" %d", i);
            }
        }
        System.out.printf("\n");
    }
}