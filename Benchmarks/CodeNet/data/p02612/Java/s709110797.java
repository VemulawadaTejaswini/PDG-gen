import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            
            while(true){
                N = N - 1000;
                
                if(N <= 0){
                    break;
                }
            }
            
            System.out.println(Math.abs(N));
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}