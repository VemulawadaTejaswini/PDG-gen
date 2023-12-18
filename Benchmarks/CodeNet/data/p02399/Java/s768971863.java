import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		String[] strInputList;
		int intResultDivision = 0;
		int intResultSurplus = 0;
		double dbResultDivisionv= 0;
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strINputNum = br.readLine();
		strInputList = strINputNum.split(" ");
		
		int intNumA = Integer.parseInt(strInputList[0]);
		int intNumB = Integer.parseInt(strInputList[1]);
		
		intResultDivision = intNumA / intNumB;
		intResultSurplus = intNumA % intNumB;
		dbResultDivisionv = 1.0 * intNumA / intNumB;
		
		System.out.println(intResultDivision + " " + intResultSurplus + " " + String.format("%.6f", dbResultDivisionv));
	}
}
