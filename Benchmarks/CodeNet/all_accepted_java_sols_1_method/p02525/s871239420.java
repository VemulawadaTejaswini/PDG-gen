import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader reader =new BufferedReader(isr);
    	
        /*??????????????°n???????????????*/
        String buf = reader.readLine();
        int n = Integer.parseInt(buf);
        
        while (n != 0) {
            /*n????????????????????????????????°???????????????*/
            buf = reader.readLine();
            StringTokenizer st = new StringTokenizer(buf," ");
            int i;
            int[] s = new int[n];
            for (i = 0;i < n;i++) s[i] = Integer.parseInt(st.nextToken());
            
            double ave = 0, dev = 0;
            for (i = 0;i < n;i++) ave += (double)s[i];
            ave /= (double)n;
            
            for (i = 0;i < n;i++) dev += (s[i] - ave) * (s[i] - ave);
            dev /= (double)n;
            dev = Math.sqrt(dev);
            System.out.printf("%.8f\n", dev);
            
            buf = reader.readLine();
            n = Integer.parseInt(buf);
        }
    }
}