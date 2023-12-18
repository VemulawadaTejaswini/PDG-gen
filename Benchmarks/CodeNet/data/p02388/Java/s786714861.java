import java.io.*;
  
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStremaReader(System.in));
        int x = Integer.perseInt(r.readLine);
  
        int cube = x * x * x;
        System.out.println(cube);
          
    }
}