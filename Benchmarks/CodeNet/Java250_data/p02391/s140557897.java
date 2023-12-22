import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
    	int a, b;
    	InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
        String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
    	a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (a > b) System.out.println("a > b");
        else if (a == b) System.out.println("a == b");
        else System.out.println("a < b");
    }
}