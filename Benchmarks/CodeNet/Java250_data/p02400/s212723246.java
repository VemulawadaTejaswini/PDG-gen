import java.io.*;
import java.lang.Math;
class Main{
    public static void main(String[] args)throws IOException{
        double r, s, l; // s:??¢???, l:??¨?????????
    	InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
        String buf = br.readLine();
        r = Double.parseDouble(buf);
    	s = r * r * Math.PI;
    	l = 2 * r * Math.PI;
        System.out.printf("%.6f %.6f\n", s, l);
    }
}