import java.io.*;

class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String[] data = new String[2];

     static void initialize ()
     {
          isr = new InputStreamReader(System.in);
          br = new BufferedReader(isr);
          for (String d : data)
          {
               d = null;
          }
     }

     static void main (String[] args)
     {
           initialize();
           try {
                data = (br.readLine()).split(" ");
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