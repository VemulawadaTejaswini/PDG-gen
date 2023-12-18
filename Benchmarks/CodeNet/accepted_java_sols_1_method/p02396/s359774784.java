import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));

            String sStr;
            int i=1;
            while ( (sStr  = stdReader.readLine()) != null) {
                int input=Integer.valueOf(sStr);
                if (input==0) {
                    // nothing to do..
                    break;
                } else {
                    System.out.println("Case" + SPACE + i + ":" + SPACE + input  );
                }
                ++i;
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}