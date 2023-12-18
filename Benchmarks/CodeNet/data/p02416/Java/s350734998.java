import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       while(true){
           String str =br.readLine();
           if(str.equals("0")){
               break;
           }
           int sum=0;
           for(int i=0;i<str.length();i++){
               sum+=Character.getNumericValue(str.charAt(i));
           }
           System.out.println(sum);
       } 
        
        
    }

        
}