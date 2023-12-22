import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String strN[] = new String[6];

        PrintWriter out = new PrintWriter(System.out);
        try {

        	for (int i=0 ; i<6 ; i++) {
        		strN[i] = br.readLine();
        	}

            boolean bResult = true;

        	int distD = Integer.parseInt(strN[5]);

        	int intN[] = new int[5];

        	for (int i=0 ; i<4 ; i++) {
        		intN[i] = Integer.parseInt(strN[i]);
        	}

        	Arrays.sort(intN);
        	int dist1 = Integer.parseInt(strN[0]);
        	int dist2 = Integer.parseInt(strN[4]);

        	if (dist2 - dist1 > distD) {
        		bResult = false;
        	}

        	if (bResult)
        		System.out.println("Yay!");
        	else
        		System.out.println(":(");


            out.flush();


        } catch (IOException e) {

        }


    }

}