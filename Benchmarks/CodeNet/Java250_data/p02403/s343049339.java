import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int h, w;

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        
        while(true) {
        	if (h == 0 && w == 0) break;
        	int i, j;
            for (i = 0;i < h;i++) {
                for (j = 0;j < w;j++) {
                    System.out.printf("#");
                }
                System.out.printf("\n");
    	    }
            System.out.printf("\n");
            buf = br.readLine();
            st = new StringTokenizer(buf," ");
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
        }
    }
}