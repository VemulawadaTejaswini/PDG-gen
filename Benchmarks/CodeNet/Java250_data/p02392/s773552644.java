import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        String[] line = reader.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        
        if(a < b){
            if(b < c){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
        
        else System.out.println("No");
        
        
    }
    
}