import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;

        try {
            str1 = br.readLine();
            String strN[] = str1.split(" +");

            int intA = Integer.parseInt(strN[0]);
            int intB = Integer.parseInt(strN[1]);
            int intC = Integer.parseInt(strN[2]);

            br.close();

            if (intA == intB && intA == intC) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }




        } catch (IOException e) {

        }


    }

}