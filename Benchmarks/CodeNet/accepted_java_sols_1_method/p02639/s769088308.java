import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            
            int result = 0;
            for(int i=0; i<strSplit.length; i++){
                if(strSplit[i].equals("0")){
                    result = i + 1;
                    break;
                }
            }
            
            System.out.println(result);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}