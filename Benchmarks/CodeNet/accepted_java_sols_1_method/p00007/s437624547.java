import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            int n = Integer.parseInt(st);
            int x = 100000;
            for(int i = 0; i < n; i ++){
                x = 1000*(int)Math.ceil(x*1.05/1000);
            }
            System.out.println(x);
        }catch(IOException ex){
            
        }
    }
}