
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) {
        try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String strLine = reader.readLine();
            char[] chaAryLineS = strLine.toCharArray();
            char[] chaAryLineSAfter = new char[chaAryLineS.length * 2];

            strLine = reader.readLine();
            char[] chaAryLineP = strLine.toCharArray();
            // chaAryLineS??? chaAryLineSAfter???COPY
            System.arraycopy(chaAryLineS, 0, chaAryLineSAfter, 0,
                    chaAryLineS.length);
            
            // chaAryLineS??? chaAryLineSAfter???????????´???COPY
            System.arraycopy(chaAryLineS, 0, chaAryLineSAfter,
                    chaAryLineS.length, chaAryLineS.length);            
            
            int intlength = chaAryLineSAfter.length - chaAryLineP.length + 1;
            int intCount = 0;
            boolean booYes = false;
            
            for (int i = 0; i < intlength; i++) {
                for (int j = 0; j < chaAryLineP.length; j++) {
                    if (chaAryLineSAfter[i+j] == chaAryLineP[j]) {
                        intCount++;
                        if (intCount == chaAryLineP.length) {
                            booYes = true;
                        }
                    }
                }
                intCount = 0;
            }
            if (booYes) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}