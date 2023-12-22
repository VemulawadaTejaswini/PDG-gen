import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf1 = br.readLine();
        
        while (true) {
            String buf2 = br.readLine();
            int i, m = Integer.parseInt(buf2);
            for (i = 1;i <= m;i++) {
                buf2 = br.readLine();
                int h = Integer.parseInt(buf2);
                String buftrans = buf1.substring(0,h);
                buf1 = buf1.substring(h) + buftrans;
            }
            System.out.println(buf1);
            buf1 = br.readLine();
            if(buf1.equals("-")) break;
        }
    }
}