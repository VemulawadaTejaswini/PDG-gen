import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //String lines[]=line.split(" ",0);
            int i=1;
            while(true){
                
                int W=Integer.parseInt(line);
                if(W==0){break;}
               
                System.out.println("case"+i+":"+W);
                i++;
            }
    }
}