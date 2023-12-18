import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);

        try {
    		String strData = br.readLine();
    		String strDat[] = strData.split(" ", -1);

    		int intAge = Integer.parseInt(strDat[0]);
    		int intYen = Integer.parseInt(strDat[1]);

    		if (intAge <= 12) intYen /= 2;
    		if (intAge <= 5) intYen = 0;

    		System.out.print(intYen );


    		out.flush();


        } catch (IOException e) {

        }


    }


}