import java.io.*;
    
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStremaReader(System.in));
        int x, cube;
  
        x = Integer.parseInt(r.readLine);
        cube = x * x * x;
        System.out.println(cube);
            
    }
}