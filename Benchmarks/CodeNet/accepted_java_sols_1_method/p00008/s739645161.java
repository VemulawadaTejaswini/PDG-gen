
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		int[] dataSet = new int[50];

		while ( ((strLine = stdReader.readLine()) != null)&&(!(strLine.equals("")))) {
			dataSet[i] = Integer.parseInt(strLine);
			i++;
		}



		for(int j = 0; j < i; j++){
			int cnt = 0;
			//System.out.println("i"+dataSet.length);
			for(int a = 0; a < 10; a++){
				for(int b = 0; b <10 ; b++){
					for(int c = 0; c < 10; c++){
						for(int d = 0; d < 10; d++){

							if((a + b + c + d) == dataSet[j]){
								cnt++;
							}

						}
					}
				}

			}
			System.out.println(cnt);

		}
	}

}