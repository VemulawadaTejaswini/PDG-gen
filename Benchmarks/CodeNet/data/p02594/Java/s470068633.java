import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int X = Integer.parseInt(br.readLine());
            if(X >= 30){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}