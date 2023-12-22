import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[]str= br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            if(a==0 && b==0){
                break;
            }else{
                if(a>b){
                    System.out.println(b+ " "+ a);
                }else{
                    System.out.println(a+ " "+ b);
                }
            }
        }
    
        
        
    }
}