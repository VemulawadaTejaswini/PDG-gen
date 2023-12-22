
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
import java.util.Scanner;


public class Main {


	/**
	 * main
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int[] cnt = new int[26];//??¢??????????????????26??????????????????
		int num = 0;		//???????????¨????????°
		String line = "";
		
		while(scan.hasNext()){
			line = scan.nextLine();
		    String st = line.toLowerCase();
		    for(int i = 0 ; i < st.length() ; i++){
			char c = st.charAt(i);
			if('a' <= c && c <= 'z') cnt[c - 'a']++;
			else continue;
			}
		}
		
		//??¨???
		for (int i = 0; i < cnt.length; i++) {
			System.out.println((char)('a'+i) + " : " + cnt[i]);
		}
	}
	
}