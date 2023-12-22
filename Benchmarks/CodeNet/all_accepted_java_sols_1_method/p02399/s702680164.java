import java.io.*;
  
public class Main {
  
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        
        String[] data = br.readLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
 
        System.out
            .println((a / b) + " " + (a % b) + " "
                + String.format("%.5f", ((double) a / (double) b)));
                
    }catch(IOException e){}
    }
}