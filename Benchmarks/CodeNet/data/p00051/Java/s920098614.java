import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	public static void main(String[] args){
		while(read()){

		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;

		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			line = sc.next();
			solve();
		}
		return true;
	}
	static void solve(){
		char[] number = new char[8];
		number = line.toCharArray();
		java.util.Arrays.sort(number);
		int minValue = Integer.parseInt(new String(number));
		char[] m = new char[8];
		for(int i = 0; i < number.length; i++){
			m[i] = number[7 - i];
		}
		int maxValue = Integer.parseInt(new String(m));
		System.out.println(maxValue - minValue);
	}
}