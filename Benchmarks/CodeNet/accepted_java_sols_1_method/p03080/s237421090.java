import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;
        String str2 = null;
        int cntR = 0;
        int cntB = 0;

        try {
            str1 = br.readLine();
            str2 = br.readLine();
            int intA = Integer.parseInt(str1);

            for (int i = 0 ; i < intA ; i++) {
            	if ( str2.charAt(i) == 'R' ) {
            		cntR++;
            	}else {
            		cntB++;
            	}
            }

            if (cntR > cntB) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");

            }







        } catch (IOException e) {

        }


    }

}