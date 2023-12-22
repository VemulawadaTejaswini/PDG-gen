import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] strArray = new String[2];
            int[] intArray = new int[2];
            DecimalFormat df = new DecimalFormat("0.00000");
            
            strArray = line.split("\\s");
            
            for (int i = 0; i < strArray.length; i++) {
				intArray[i] =Integer.parseInt(strArray[i]);
			}
   
            System.out.println(intArray[0]/intArray[1] +" " +
            		intArray[0]%intArray[1] + " " +
            		df.format((double)intArray[0]/(double)intArray[1])
            		);
   
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}