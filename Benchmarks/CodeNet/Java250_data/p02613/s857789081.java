import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(reader.readLine());
	int ac = 0;
	int wa = 0;
	int tle = 0;
	int re = 0;
	for(int i = 0;i<a;i++){
		String p = reader.readLine();
		switch(p){
			case "AC":
				ac++;
				break;
			case "WA":
				wa++;
				break;
			case "TLE":
				tle++;
				break;
			case "RE":
				re++;
				break;
		}
	}
	System.out.println("AC x "+ac);
	System.out.println("WA x "+wa);
	System.out.println("TLE x "+tle);
	System.out.println("RE x "+re);
	}
}
