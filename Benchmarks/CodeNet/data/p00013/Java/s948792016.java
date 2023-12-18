import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int MAX_DETASET  = 100;
		int cnt = 0;

		boolean nullflug = true;
		ArrayList<Integer> pushList = new ArrayList<Integer>();
		ArrayList<Integer> popList = new ArrayList<Integer>();

		//1. int?????????????????\???????????????????????????

8		while((strLine = stdReader.readLine()) != null) {
			int temp = 0;
			//if(!strLine.equals("")){
				temp = Integer.parseInt(strLine);
		//	}
			if(temp == 0 ){
				popList.add(pushList.get(cnt-1));
				pushList.remove(cnt-1);
				cnt--;
			}else{
				pushList.add(temp);
				cnt++;
			}

		}

		//2. ??????

		for(int i = 0; i < popList.size(); i++){

			System.out.println(popList.get(i));

		}


	}


}