import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));

            String sStr = stdReader.readLine();
            int i=0;
            while (sStr != null) {
                int input=Integer.valueOf(sStr);
                if (input==0) {
                    // nothing to do..
                    break;
                } else {
                    System.out.println("Case  :" + i );
                }
                ++i;
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}