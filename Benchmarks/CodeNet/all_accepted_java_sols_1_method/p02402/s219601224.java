import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		String line;

		int numN = 0;
		int numMin = 0;
		int numMax = 0;
		long numAdd = 0;

		String[] NumWork;
		int[]   NumList;
		try {
			//??\????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();

			//???????????£?¨?
			numN    = Integer.parseInt(line);
			NumList = new int[numN];

			//System.out.println(numN);
			while (true) {
				//?????????????????????
				line = br.readLine();
				if(line != null){

					//??°??£?????´??°?????????
					NumWork = line.split(" ", 0);

					//??´??°?????°??????
					for (int i = 0; i < NumWork.length; i++) {
						NumList[i] = Integer.parseInt(NumWork[i]);
					}
					//System.out.println(NumList[0] + "+" +  NumList[1]);

					numMin = NumList[0];
					numMax = NumList[0];
					//??´??°?????????
					for (int i = 1; i < NumList.length; i++) {

							numMin = Math.min(NumList[i], numMin);
							numMax = Math.max(NumList[i], numMax);
					}
					//??´??°???????¨?
					for (int i = 0; i < NumList.length; i++) {
						numAdd = numAdd + NumList[i];
					}
					//???????????????
					System.out.println(numMin + " " + numMax + " " + numAdd);
				}else{
					break;
				}
			}
		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}