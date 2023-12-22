import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                int n = Integer.parseInt(reader.readLine());
                if(n == 0){
                    break;
                }
                int sum = 0;
                int max = 0;
                int min = 1000;
                for(int i = 0; i < n; i++){
                    int a = Integer.parseInt(reader.readLine());
                    sum += a;
                    if(max < a){
                        max = a;
                    }
                    if(min > a){
                        min = a;
                    }
                }
                    int ave = (sum - max - min)/(n - 2);
                    System.out.println(ave);
                
                }
            
        } catch (IOException e) {
            
        }
    }
}
