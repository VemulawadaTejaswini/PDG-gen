import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		List<Integer>intList = new ArrayList<Integer>();
		String strINputNum = "";
		int intInputNum = 0;
		String strStopNum = "0";
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		do {
			strINputNum = br.readLine();
			intInputNum= Integer.parseInt(strINputNum);
			intList.add(intInputNum);

		}while(!(strINputNum.equals(strStopNum)));
		
		int intOutputCount = intList.size() - 1;
	
		for(int i = 0; i < intOutputCount; i++) {
				System.out.println("Case " + (i+1) + ": " + intList.get(i));
			}
	}
}
