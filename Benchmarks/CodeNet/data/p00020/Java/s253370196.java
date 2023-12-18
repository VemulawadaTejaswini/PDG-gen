
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));
		int maxDataSize = 200;

		int argsCnt = 0;
		char[] dataSet = new char[maxDataSize];


		while ( ((strLine = stdReader.readLine()) != null)) {
			break;
		}

		byte[] asciiArray = strLine.getBytes("US-ASCII");

		for (int i = 0; i < asciiArray.length; i++) {

			if((asciiArray[i] >=  'a') && (asciiArray[i] <='z')){
				byte b = 32;
				asciiArray[i] = (byte)(Byte.toUnsignedInt(asciiArray[i]) -32);
			}


	}
		String resultString = new String(asciiArray, "US-ASCII");
		System.out.println(resultString);
	}

}