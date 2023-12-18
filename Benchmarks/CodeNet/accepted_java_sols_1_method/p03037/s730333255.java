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

    		int intCard = Integer.parseInt(strDat[0]);
    		int intGate = Integer.parseInt(strDat[1]);

    		int intL[] = new int [intGate];
    		int intR[] = new int [intGate];

    		int intSt;
    		int intEd;

    		intSt = 0;
    		intEd = intCard;

    		for (int i=0 ; i<intGate ; i++) {
        		strData = br.readLine();
        		strDat = strData.split(" ", -1);

        		intL[i] = Integer.parseInt(strDat[0]);
        		intR[i] = Integer.parseInt(strDat[1]);

        		if (intL[i] > intSt) intSt = intL[i];
        		if (intR[i] < intEd) intEd = intR[i];

    		}
    		int ans = 0;

//    		for (int i=0 ; i<intCard ; i++) {
//    		for (int i = intSt-1 ; i <= intEd-1 ; i++) {
//    			int j;
//	    		for (j=0 ; j<intGate ; j++) {
//	    			if (!(intL[j] <= i+1 && i+1 <= intR[j])) break;
//	    		}
//
//	    		if (j == intGate) ans ++;
//    		}

    		ans = intEd - intSt+ 1;
    		if (ans < 0) ans = 0;

    		System.out.println(ans );

    		out.flush();


        } catch (IOException e) {

        }


    }


}