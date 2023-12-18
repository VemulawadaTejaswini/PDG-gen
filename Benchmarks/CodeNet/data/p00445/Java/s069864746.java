import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String input;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		input = sc.next();
		return true;
	}
	
	static void solve(){
		int joi = 0, ioi = 0;
		for(int i = 0; i < input.length()-2; i++){
			StringBuffer sb = new StringBuffer(input.substring(i, i+3));
			if( sb.toString().equals("JOI") )joi++;
			if( sb.toString().equals("IOI") )ioi++;
		}
		System.out.println(joi);
		System.out.println(ioi);
	}

}