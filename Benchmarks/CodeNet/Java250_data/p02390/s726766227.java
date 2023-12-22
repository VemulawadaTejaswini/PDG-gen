import java.io.*;

public class Main{
public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int s = Integer.parseInt(str);

		if((0 <= s) && (s < 86400)){
		int hour = s/(60*60);
		int minute = s%(60*60)/60;
		int second = s%(60*60)%60;
		System.out.println(hour + ":" + minute + ":" + second);
		}
	}catch(IOException e){
	System.out.println(e);
	}
}
}