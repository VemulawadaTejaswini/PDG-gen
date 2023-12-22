import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn =scan.nextLine();
		int intLoop = 0;
		int intSplit = 0;
		String strAns = "";
		String strTemp = "";
		ArrayList<String> list = new ArrayList<String>();
		while(!"-".equals(strIn)){
			intLoop = scan.nextInt();
			for(int i = 0; i < intLoop; i++){
				intSplit = scan.nextInt();
				strTemp = "";
				strAns ="";
				for(int j = 0; j < strIn.length(); j++){

					if(j < intSplit){
						strTemp += strIn.charAt(j);
						//System.out.println("strTemp : " + strTemp);
					}else{
						strAns += strIn.charAt(j);
						//System.out.println("strAns : " + strAns);
					}
				}
				strIn = strAns + strTemp;
			}
			//System.out.println(strIn);
			list.add(strIn);
			strIn =scan.next();
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		scan.close();
	}
}