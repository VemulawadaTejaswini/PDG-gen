import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strNum = br.readLine();
		String[] strNumList = strNum.split(" ");
		
		int intNumA = Integer.parseInt(strNumList[0]);
		int intNumB = Integer.parseInt(strNumList[1]);
		int intNumC = Integer.parseInt(strNumList[2]);
		
		String strResult = "";
		
		if(intNumA < intNumB) {
			if(intNumB < intNumC) {
				strResult = "Yes";
			}else {
				strResult = "No";
			}
		}else {
			strResult = "No";
		}
		System.out.println(strResult);
	}
}
