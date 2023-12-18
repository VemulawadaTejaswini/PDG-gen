import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = br.readLine();
            
            int result = 0;
            int kariResult = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == 'R'){
                    kariResult++;
                    result = kariResult;
                }else{
                    kariResult = 0;
                }
            }
            
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}