import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader reader =new BufferedReader(isr);
    	
        /*???????????¬??°w???????????????*/
        String buf = reader.readLine();
        int w = Integer.parseInt(buf);
        
        /*?¨??£??????¬??°n???????????????*/
        buf = reader.readLine();
        int n = Integer.parseInt(buf);
        
        int i;
        int[] num = new int[w];
        
        for (i = 0;i < w;i++) {
            num[i] = i + 1;
        }
        
        for (i = 0;i < n;i++) {
            /*i??????????¨??£????????????????*/
            buf = reader.readLine();
            StringTokenizer st = new StringTokenizer(buf,",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = num[a - 1];
            num[a - 1] = num[b - 1];
            num[b - 1] = x;
        }
        
        for (i = 0;i < w;i++) System.out.println(num[i]);
    }
}