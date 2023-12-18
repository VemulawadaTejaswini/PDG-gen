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
                int i2 = i / 10;
                if (i2 > 0 && i2 % 10 == 3) {
                    System.out.printf(" %d", i);
                    int i3 = i2 / 10;
                    if (i3 > 0 && i3 % 10 == 3) {
                        System.out.printf(" %d", i);
                        int i4 = i / 10;
                        if (i4 > 0 && i4 % 10 == 3) {
                            System.out.printf(" %d", i);
                        }
                    }
                }
            }
        }
        System.out.printf("\n");
    }
}