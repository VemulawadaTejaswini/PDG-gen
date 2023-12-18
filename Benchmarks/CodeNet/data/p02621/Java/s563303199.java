import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int a = Integer.parseInt(br.readLine());
            
            System.out.println(a + a*a + a*a*a);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}