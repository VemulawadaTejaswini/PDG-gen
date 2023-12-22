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
            int input3 = Integer.valueOf(inputStr[2]).intValue();

            if (input1 < input2 && input2 < input3) {
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