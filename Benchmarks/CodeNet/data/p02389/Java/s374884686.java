import java.io.*;
  
class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String str;
     static String[] data = new String[2];
  
     static void initialize ()
     {
          isr = new InputStreamReader(System.in);
          br = new BufferedReader(isr);
          str = null;
          for (String d : data)
          {
               d = null;
          }
     }
  
     public static void main (String[] args)
     {
           initialize();
           try {
                str = br.readLine();
                data = str.split(" ");
                System.out.println((Integer.parseInt(data[0])*Integer.parseInt(data[1])) + " " + (2*(Integer.parseInt(data[0])+Integer.parseInt(data[1]))));
           } catch (IOException e) {
           } finally {
                try {
                      br.close();
                } catch (IOException e) {
                }
           }
     }
}