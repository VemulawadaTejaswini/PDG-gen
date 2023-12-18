import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] strArray = new String[n];

		for(int i = 0; i < strArray.length ;i++){
			strArray[i] = br.readLine();

			String[] strParseByHoshino = strArray[i].split("Hoshino",-1);

			//Hoshino???????????§?????????Hoshina??§???????????´???
			if(strParseByHoshino.length >= 2){
				for(int j = 0; j < strParseByHoshino.length ; j++){
					System.out.print(strParseByHoshino[j]);
					if(j < strParseByHoshino.length - 1){
						System.out.print("Hoshina");
					}
				}
				System.out.println();
			}
			else {
				System.out.println(strArray[i]);
			}
		}
	}

}