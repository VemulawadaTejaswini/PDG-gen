import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {



		int[] iptNumber = new int [30];

		for(int i = 0; i < 30; i++) {
			iptNumber[i] =	Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		}

		int count = 0;

		for(int i =  0; i < 30; i++) {
			count = 0;
			for(int j = 0; j <=(int)(iptNumber[i] / 2); i++) {
				if(isPrimeNumber(j)) count++;

			}
			System.out.println(count);
		}
	}

	public static boolean isPrimeNumber(int num) {
		boolean[] flg = {false,false,true,true,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,false,};
		if(num < (int)(num / 2)) num =(int)(num / 2);

		return flg[num];
	}

}