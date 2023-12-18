import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int n, i;
        
        /*1???????????\????????????n???????????????*/
        Scanner scan = new Scanner(System.in);
        String buf = scan.next();
        n = Integer.parseInt(buf);
        
        /*n????????°???????????????*/
        int[] num = new int[n];
        
        for(i = 0;i < n;i++) {
            buf = scan.next();
            num[i] = Integer.parseInt(buf);
        }
        
        /*??????????????????*/
        int j;
        for (i = n - 1;i > 0;i--) {
            for (j = 0;j < i;j++) {
                if (num[j] > num[j + 1]) {
                    int w = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = w;
                }
            }
        }
        
        i = 0;
        while (true) {
            System.out.printf("%d ", num[i]);
            i++;
            if (i >= n - 1) break;
        }
        System.out.printf("%d\n", num[i]);
    }
}