import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader reader =new BufferedReader(isr);
    	
        /*1?????????????????????*/
        String buf = reader.readLine();
        int n = Integer.parseInt(buf);
        
        /*2?????????????????????*/
        buf = reader.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
        int i;
        int[] s = new int[n];
        for (i = 0;i < n;i++) s[i] = Integer.parseInt(st.nextToken());
        
        /*3?????????????????????*/
        buf = reader.readLine();
        int q = Integer.parseInt(buf);
        
        /*4?????????????????????*/
        buf = reader.readLine();
        st = new StringTokenizer(buf," ");
        int[] t = new int[q];
        for (i = 0;i < q;i++) t[i] = Integer.parseInt(st.nextToken());
        
        int j, c = 0;
        for (i = 0;i < q;i++) {
            for (j = 0;j < n;j++) {
                if(t[i] == s[j]) {
                    c++;
                    break;
                }
            }
        }
        
        System.out.println(c);
    }
}