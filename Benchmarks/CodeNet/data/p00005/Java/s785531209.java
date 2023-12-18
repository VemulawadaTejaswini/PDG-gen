
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		int max = 50;
		int[] tempInt = new int[2];

		while ( i <= max && ((strLine = stdReader.readLine()) != null) ){


				//??????????????§?????????
				String[] temp = strLine.split(" ",-10);
				tempInt[0] =Integer.parseInt(temp[0]);
				tempInt[1] = Integer.parseInt(temp[1]);

				int maxYakusu = 1;

				for(int k = tempInt[1]-1 ; k > 1 ; k--){

					if((tempInt[0]%k == 0)&&(tempInt[1]%k == 0)){
						tempInt[0] = tempInt[0]/k;
						tempInt[1] = tempInt[1]/k;
						maxYakusu = maxYakusu * k;


					}

				}


				//????°???¬?????°????±????????????????????´???????
				int maxBaisu = maxYakusu * tempInt[0] * tempInt[1];

				System.out.println(maxYakusu+" "+maxBaisu);
				i++;
		}

	}

}