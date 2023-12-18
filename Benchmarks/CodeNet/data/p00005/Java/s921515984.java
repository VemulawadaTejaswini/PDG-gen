
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
		int[] kouyaku = new int[max];
		int[] koubai = new int[max];

		while ( i <= max && ((strLine = stdReader.readLine()) != null) ){


				//??????????????§?????????
				String[] temp = strLine.split(" ",-10);
				int[] tempInt = new int[2];
				int[] tempInt2 = new int[2];

				tempInt[0] = Integer.parseInt(temp[0]);
				tempInt[1] = Integer.parseInt(temp[1]);
				tempInt2[0] = Integer.parseInt(temp[0]);
				tempInt2[1] = Integer.parseInt(temp[1]);


				//?????§??¬?´???°????±????????????????????´???????
				kouyaku[i] = calcKouyaku(tempInt);

				//????°???¬?????°????±????????????????????´???????
				koubai[i] = calcKoubai(tempInt2);

				i++;
		}


		//?????????????????????
		for(int j = 0; j < i; j++){
				System.out.println(kouyaku[j] +" "+koubai[j]);
			}


	}

	public static int calcKouyaku(int[] tempInt){

		java.util.Arrays.sort(tempInt);

		int maxYakusu = 1;

		for(int k = tempInt[0]-1 ; k > 1 ; k--){

			if((tempInt[0]%k == 0)&&(tempInt[1]%k == 0)){
				tempInt[0] = tempInt[0]/k;
				tempInt[1] = tempInt[1]/k;
				maxYakusu = maxYakusu * k;


			}

		}

		return maxYakusu;



	}

	public static int calcKoubai(int[] tempInt){

		java.util.Arrays.sort(tempInt);
		int[] tempAmari = new int[2];
		int maxYakusu= 1;

		for(int k = tempInt[0]-1 ; k > 1 ; k--){

			if((tempInt[0]%k == 0)&&(tempInt[1]%k == 0)){
				tempInt[0] = tempInt[0]/k;
				tempInt[1] = tempInt[1]/k;
				//tempAmari[0] = tempAmari[0]%k;
				//tempAmari[1] = tempAmari[1]%k;
				maxYakusu = maxYakusu * k;

			}

		}


		return maxYakusu*tempInt[0]*tempInt[1];

	}


}