import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] a) throws IOException{
    	;
    	String strLine ="";
    	BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));

    	Integer[] hill = new Integer[10];
    	int i = 0;

    	while((strLine = stdReader.readLine()) != null){
    		hill[i] = Integer.parseInt(strLine);
    		i++;
    	}

    	Arrays.sort(hill);

    	for(i = 9; i >= 7; i--){
    		System.out.println(hill[i]);
    	}
    }

}