

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            int i = Integer.parseInt(br.readLine());
            double c =Math.PI*2*i;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
    
