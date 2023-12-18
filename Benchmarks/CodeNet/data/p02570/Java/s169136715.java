import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
         
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        int D = Integer.parseInt(str1);
        int T = Integer.parseInt(str2);
        int S = Integer.parseInt(str3);
        
        if((D/S)<=T){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}