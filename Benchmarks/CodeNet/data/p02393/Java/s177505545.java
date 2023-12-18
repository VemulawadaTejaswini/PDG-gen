 import java.io.*;
     
class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String output;
     static String[] data = new String[3];
     
     static void initialize ()
     {
          isr = new InputStreamReader(System.in);
          br = new BufferedReader(isr);
          output = null;
          for (String d : data)
          {
               d = null;
          }
     }

     static void output ()
     {
           String tmp = null;
           for (int i=0; i<2; ++i) {
                if (Integer.parseInt(data[i])>Integer.parseInt(data[++i])) {
                     tmp = data[--i];
                     data[i] = data[++i];
                     data[i] = tmp;
                }
           }
           for (i=0; i<data.length;++i) {
                if (i>data.length-1) {
                     System.out.print(data[i] + " ");
                } else {
                     System.out.println(data[i]);
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