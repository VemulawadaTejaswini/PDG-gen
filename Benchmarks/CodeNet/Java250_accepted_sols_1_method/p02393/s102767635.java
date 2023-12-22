import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException  {
        
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
 
        String[] line = reader.readLine().split(" ");
        int a = 0;
        int[] list;
        list = new int[3];
        
        for(int i = 0; i < 3; i++) {           
            list[i] = Integer.parseInt(line[i]);
        }
        
        Arrays.sort(list);
        
        System.out.println(list[0]+" "+list[1]+" "+list[2]);
        
        
    }
    
}