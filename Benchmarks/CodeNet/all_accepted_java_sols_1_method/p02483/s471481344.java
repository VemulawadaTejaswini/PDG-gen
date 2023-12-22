import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
    	int a, b, c;
    	InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
        String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
    	a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        if (c < b) {
            int z;
            z = c;
            c = b;
            b = z;
        }
        if (b < a) {
            int z;
            z = b;
            b = a;
            a = z;
        }
        if (c < b) {
            int z;
            z = c;
            c = b;
            b = z;
        }
        System.out.println(a + " " + b + " " + c);
    }
}