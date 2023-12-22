import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] strArray = new String[3];
            int[] intArray = new int[3];
            int count = 0;
            
            strArray = line.split("\\s");
            
            for (int i = 0; i < strArray.length; i++) {
				intArray[i] =Integer.parseInt(strArray[i]);
			}
            for (int i = intArray[0]; i < intArray[1] + 1; i++) {
				if(intArray[2] % i == 0)
					count++;
			}
            System.out.println(count);
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}