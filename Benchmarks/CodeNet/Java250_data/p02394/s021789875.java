import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArray = br.readLine().split("\\s");
            int[] intArray = new int[5];
            int w,h,x,y,r;
            
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.valueOf(strArray[i]);
            }
            
            w = intArray[0];
            h = intArray[1];
            x = intArray[2];
            y = intArray[3];
            r = intArray[4];
            
            if(r <= x & x <= h-r & r <= y & y <= h-r){
                System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}