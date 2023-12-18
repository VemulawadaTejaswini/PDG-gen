import java.io.*;

public class Main{
    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
        try{
            String x ;
            x = reader.readLine();
            int A ;
            while(x != null){
            int sum = 0;
            for(int i = 0;i < x.length() ; i++){
                A = x.charAt(i) - '0';
                sum += A;
            }
            if(sum != 0){
                System.out.println(sum);
            }
            x = reader.readLine();
        }
    }catch(IOException e){
        System.out.println(e);
    }
    }       
}
