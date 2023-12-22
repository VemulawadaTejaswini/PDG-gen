import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String sStr = stdReader.readLine();

            String[] inputStr = sStr.split(" ");
            int w = Integer.valueOf(inputStr[0]).intValue();
            int h = Integer.valueOf(inputStr[1]).intValue();
            int x = Integer.valueOf(inputStr[2]).intValue();
            int y = Integer.valueOf(inputStr[3]).intValue();
            int r = Integer.valueOf(inputStr[4]).intValue();

            if ( w >= x+r && h >=y+r && (x>0 && y>0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}