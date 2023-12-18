
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) throws IOException{

		long num = 0;
		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int maxcnt = 0;
		int cnt = 0;

		ArrayList<String> list = new ArrayList<String>();

		BigInteger max = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");


		while ( ((strLine = stdReader.readLine()) != null)) {

			if(maxcnt == 0){
				maxcnt = 2 * Integer.parseInt(strLine);
			}else{
				list.add(strLine);
				cnt++;
			}

			if(cnt == maxcnt){
				break;
			}if(cnt > 50){
				break;
			}
		}


		for (int i = 0; i < maxcnt; i = i + 2 ) {

			BigInteger t1 = new BigInteger((String)list.get(i));
			BigInteger t2  = new BigInteger((String)list.get(i+1));
			BigInteger result = t1.add(t2);

		if((t1.compareTo(max) >= 0 ) || (t2.compareTo(max) >= 0 ) || (result.compareTo(max) >= 0 )){
			System.out.println("overflow");
		}else{
			System.out.println(result);
		}

	}

	}
}