import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] a) throws IOException{

    	String strLine ="";
    	BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));

    	String[] inputStr = new String[2];
    	Integer[] keta = new Integer[200];

    	int i = 0;

    	while ( i < 200 && ((strLine = stdReader.readLine()) != null) ){
    		inputStr = strLine.split(" ",0);
    		int temp1 = Integer.parseInt(inputStr[0]);
    		int temp2 = Integer.parseInt(inputStr[1]);

    		keta[i] = caulKeta(temp1 + temp2);

    		i++;
	   	}

    	for(int c = 0; c < i; c++){
    		System.out.println(keta[c]);
    	}


    }

public static int caulKeta(int suuji){

	int keta = 1;

	for(int i = 10; suuji/i !=0; i =i*10 ){

		keta ++;
	}

	return keta;
}

}