import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;
        String strDat = null;


        PrintWriter out = new PrintWriter(System.out);
        try {
            str1 = br.readLine();
            strDat = br.readLine();

            String str2[] = strDat.split(" ", 0);

            int intCnt = Integer.parseInt(str1);

            int intHigh[] = new int [intCnt+1];
            for (int i=0 ; i<intCnt ; i++) {
            	intHigh[i] = Integer.parseInt(str2[i]);
            }


            int intSee=0;

            int intNowHigh=0;
            for (int i=0 ; i<intCnt; i++) {
            	if (intNowHigh <= intHigh[i]) {
            		intNowHigh = intHigh[i];
            		intSee ++;
            	}
            }


            System.out.println(intSee);


        } catch (IOException e) {

        }


    }
}