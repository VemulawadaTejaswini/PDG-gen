import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line1 = reader.readLine();
            int n = Integer.parseInt(line1);
            String line2 = reader.readLine();
            String[] str = line2.split(" ");
            for(int i = n-1;i >= 0;i-- ){
                if(i != 0){
                    System.out.print(str[i] + " ");
                }else{
                    System.out.println(str[i]);
                }
            }
        } catch (IOException e) {
    
        }
    }
   
}
