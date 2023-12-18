import java.io.*;
import java.util.Arrays;
class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String output;
     static String[] data = new String[3];
     static int[] idata = new int[3];
      
     static void initialize ()
     {
          isr = new InputStreamReader(System.in);
          br = new BufferedReader(isr);
          output = null;
          for (String d : data)
          {
               d = null;
          }
          for (int i : idata)
          {
               i = 0;
          }
     }
 
     static void output ()
     {
           for (int i=0; i<data.length;++i) {
               idata[i] = Integer.parseInt(data[i]);
           }
           
           Arrays.sort(idata);
           
           for (int j=0; j<data.length;++j) {
                if (j<data.length-1) {
                     System.out.print(idata[j] + " ");
                } else {
                     System.out.println(idata[j]);
                }
           }
     }
      
     public static void main (String[] args)
     {
           initialize();
           try {
                data = (br.readLine()).split(" ");
                output();
           } catch (IOException e) {
           } finally {
                try {
                      br.close();
                } catch (IOException e) {
                }
           }
     }
}