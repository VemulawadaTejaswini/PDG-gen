import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String S = br.readLine();
            
            if(S.matches("[A-Z]")){
                System.out.println("A");
            }else{
                System.out.println("a");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}