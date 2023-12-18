import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] strArray = new String[1];
            double[] doubleArray = new double[1];
            DecimalFormat df = new DecimalFormat("0.000000");
            
            strArray = line.split("\\s");
            
            for (int i = 0; i < strArray.length; i++) {
				doubleArray[i] = Double.parseDouble(strArray[i]);
			} 
            System.out.println(df.format(doubleArray[0]*doubleArray[0]*Math.PI)+" "+df.format(doubleArray[0]*2*Math.PI));
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}