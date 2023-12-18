
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


		while ( i <= max && ((strLine = stdReader.readLine()) != null) ){


				//??????????????§?????????
				String[] temp = strLine.split(" ",-10);
				int temp1 =Integer.parseInt(temp[0]);
				int temp2 = Integer.parseInt(temp[1]);


				//?????§??¬?´???°????±????????????????????´???????
				int maxYakusu = calcKouyaku(temp1,temp2);

				//????°???¬?????°????±????????????????????´???????
				int maxBaisu = calcKoubai(temp1,temp2);

				System.out.println(maxYakusu+" "+maxBaisu);
				i++;
		}





	}

	public static int calcKouyaku(int temp1,int temp2){


		int maxYakusu = 1;

		for(int k = temp1-1 ; k > 1 ; k--){

			if((temp1%k == 0)&&(temp2%k == 0)){
				temp1 = temp1/k;
				temp2 = temp2/k;
				maxYakusu = maxYakusu * k;


			}

		}

		return maxYakusu;



	}

	public static int calcKoubai(int temp1, int temp2){

		int maxYakusu= 1;

		for(int k = temp1-1 ; k > 1 ; k--){

			if((temp1%k == 0)&&(temp2%k == 0)){
				temp1 = temp1/k;
				temp2 = temp2/k;
				maxYakusu = maxYakusu * k;

			}

		}


		return maxYakusu*temp1*temp2;

	}


}