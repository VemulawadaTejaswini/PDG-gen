import java.util.Scanner;
import java.io.*;
public class Main{
	public static void main(String [] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1200);
		String work = "";
		String input = "";
		
		try{
			input = r.readLine();
			while(input != null){
				work += input;
				input = r.readLine();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		work = work.toLowerCase();
		int code;
		int count[] = new int[26];
		for(int i = 0; i < work.length(); i++){
			code = ((int)work.charAt(i)) - 97;
			if(!(0 <= code && code <= 25)){
				continue;
			}
			count[code]++;
		}
		for(int i = 0; i < count.length; i++){
			
			System.out.printf("%c : %d\n",i+97,count[i]);
		}
	}
}