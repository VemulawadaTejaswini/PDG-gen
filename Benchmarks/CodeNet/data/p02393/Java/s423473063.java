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
            int input1 = Integer.valueOf(inputStr[0]).intValue();
            int input2 = Integer.valueOf(inputStr[1]).intValue();
            int input3 = Integer.valueOf(inputStr[2]).intValue();

            int[] unsortedInt = {input1, input2, input3};
            Arrays.sort(unsortedInt);
            
            StringBuilder sb = new StringBuilder();
            for(int i: unsortedInt) {
                sb.append(" ");
                sb.append(i);
            }
            sb.deleteCharAt(0);
            System.out.println(sb.toString());

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}