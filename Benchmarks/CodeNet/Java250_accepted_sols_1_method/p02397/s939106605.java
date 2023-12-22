import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 1;
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                
                // x ??¨ y ????????????0?????´????????????
                if(x == 0 && y == 0) {
                    break;
                }
                
                // x ??¨ y????????????????°???????????????????????????? (????§???????????????§??????) 
                if(x > y) {
                    int temp = x;
                    x = y;
                    y = temp;
                }
                
                System.out.println(x + " " + y);
                
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}