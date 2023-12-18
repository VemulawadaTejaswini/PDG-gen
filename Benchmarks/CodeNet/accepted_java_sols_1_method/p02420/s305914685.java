import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try{
        while(!(line = reader.readLine()).equals("-")){

        int m =Integer.parseInt(reader.readLine());

        for(int i=0;i<m;i++){
            int h =Integer.parseInt(reader.readLine());
            line = line.substring(h,line.length()) + line.substring(0,h);
        }
        System.out.println(line);
        }
        } catch (IOException e){
            System.out.println(e);
        }
        
    }
    
    
}
