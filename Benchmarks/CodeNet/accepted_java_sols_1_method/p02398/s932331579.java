import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int a = Integer.valueOf(inputs[0]);
                int b = Integer.valueOf(inputs[1]);
                int c = Integer.valueOf(inputs[2]);
                
                int count = 0;
                if (b < c) {
                    for (int x = a; x <= b; x++) {
                        if (c % x == 0) {
                            count++;
                        }
                    }
                } else {
                    for (int x = a; x <= c; x++) {
                        if (c % x == 0) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}