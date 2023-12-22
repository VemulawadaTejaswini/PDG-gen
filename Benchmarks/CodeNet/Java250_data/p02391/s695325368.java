import java.io.*;
    
class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String output;
     static String[] data = new String[2];
    
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
    
     public static void main (String[] args)
     {
           initialize();
           try {
                data = (br.readLine()).split(" ");
                if (Integer.parseInt(data[0])-Integer.parseInt(data[1]) == 0) {
                     output = "a == b";
                } else if (Integer.parseInt(data[0])-Integer.parseInt(data[1]) > 0) {
                     output = "a > b";
                } else {
                     output = "a < b";
                }
            System.out.println(output);
           } catch (IOException e) {
           } finally {
                try {
                      br.close();
                } catch (IOException e) {
                }
           }
     }
}