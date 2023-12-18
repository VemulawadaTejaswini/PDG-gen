import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] ArrayX = new String[2];
		int[] Numbers = new int[2];
		int divite;
		int amari;
		double syosu;
		
				
		ArrayX = line.split(" ");
		Numbers[0] = Integer.parseInt(ArrayX[0]);
		Numbers[1] = Integer.parseInt(ArrayX[1]);
		
		divite = Numbers[0]/Numbers[1];
		amari =Numbers[0]%Numbers[1];
		
		syosu = ((double)Numbers[0]/(double)Numbers[1]);
		String after = String.format("%.5f", syosu);


		
		
		System.out.println(divite + " " + amari + " " + after);
	}

}