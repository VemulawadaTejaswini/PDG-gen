import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* input */
            while(true){
                line = br.readLine();
                if(line.equals("END OF INPUT")) break;
                
                String[] str = line.split(" ");
                
                for(String s : str){
                	System.out.print(s.length());
                }
                	
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}