import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strA = insBR.readLine();
			int intA = Integer.parseInt(strA);
			int intDiv = 0;
			int intDiv10 = 0;
			String strIndex = "";
			int intIndex = 0;
			for(int i = 1; i <= intA; i++){
				intDiv = i % 3;
				intDiv10 = i % 10;
				strIndex = Integer.toString(i);
				intIndex = strIndex.indexOf("3");
				if(intDiv == 0 || intDiv10 == 3 || intIndex != -1){
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

