import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        
        while (true) {
            int i, sum = 0;
            if (Character.getNumericValue(buf.charAt(0)) == 0) break;
            for (i = 0;i < buf.length();i++) {
                sum += Character.getNumericValue(buf.charAt(i));
            }
            System.out.println(sum);
            buf = br.readLine();
        }
    }
}