import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????



		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		Boolean isContinue = true;

		while(isContinue){

			int intNum = 0;
			try {

				String strIn = insBR.readLine();
				intNum = Integer.parseInt(strIn);

				if(intNum != 0 ){
					list.add(intNum);

				}else{
					isContinue = false;
				}

			}catch(IOException e){
				System.out.println(e);

			}catch(NumberFormatException e){
				System.out.println(e);
			}


		}

		for(int i = 0; i < list.size(); i++){

			System.out.print("Case " + (i + 1) + ": ");
			System.out.println(list.get(i));
		}
	}
}