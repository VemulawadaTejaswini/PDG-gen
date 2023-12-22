import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String sStr = stdReader.readLine();

            String[] inputStr = sStr.split(" ");
            int input1 = Integer.valueOf(inputStr[0]).intValue();
            int input2 = Integer.valueOf(inputStr[1]).intValue();

            if (input1 > input2) {
                System.out.println("a > b");
            } else if ( input1==input2) {
                System.out.println("a == b");
            } else {
                System.out.println("a < b");
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}