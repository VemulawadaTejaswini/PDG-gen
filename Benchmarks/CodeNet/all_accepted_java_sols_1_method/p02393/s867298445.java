import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
          
        String line = r.readLine();    
        String[] w = line.split(" ",0);
        Arrays.sort(w);
        System.out.println(w[0]+" "+w[1]+" "+w[2]);
        r.close();
    }
}