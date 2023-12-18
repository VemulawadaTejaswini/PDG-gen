import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String[] sabc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] nabc = new int[sabc.length];
		for(int i=0; i<nabc.length; i++)nabc[i]=0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str=br.readLine();
		while(str !=null){		
		
			String[] strArray = str.split("");
			for (int i = 0; i < strArray.length; i++) {
				strArray[i] = strArray[i].toLowerCase();
				for(int j = 0; j < sabc.length; j++){
					if(strArray[i].equals(sabc[j])){
						nabc[j]++;
					}
				}
			}
		str = br.readLine();
		}
		for(int j=0; j<sabc.length; j++){
			System.out.println(sabc[j] + " : " + nabc[j]);
		}
	}
}