import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x;
        int i=1;
        
        while(true){
            x = reader.readLine();
            if(Integer.parseInt(x)==0){
                break;
            }
            System.out.println("Case "+i+": "+Integer.parseInt(x));
            i++;
        }
    }
}