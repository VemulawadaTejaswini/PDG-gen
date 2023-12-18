import java.io.*;

class Main
{

     static String[] data = new String[2];

     static int getS() {
          return (Integer.parseInt(data[0]))*(Integer.parseInt(data[1]));
     }

     static int getL() {
          return 2*((Integer.parseInt(data[0]))+(Integer.parseInt(data[1])));
     

     public static void main (String[] args)
     {
          BufferedReader br = new BufferedReader(new InputStreamReader(Sysytem.in));
          try {
               data = (br.readLine()).split(" ");
          } catch (IOException e) {
          } finally {
               try {
                    br.close();
               } catch (IOException e) {
               }
          }
          System.out.println(getS() + " " + getL());
     }
}