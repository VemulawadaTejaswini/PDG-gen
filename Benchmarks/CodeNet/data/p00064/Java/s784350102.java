import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pass = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.equals("end")) break;
			pass += sumAll(line);
		}
		System.out.println(pass);
		sc.close();
	}
	
	static int sumAll(String str) {
		List<Integer> begin = new ArrayList<Integer>();
		List<Integer> end = new ArrayList<Integer>();
		
		boolean c = false;
		for(int i = 0; i < str.length(); i++) {
			if(isNum(str.charAt(i))) {
				if(!c) {
					begin.add(i);
					c = true;
				}
			}else {
				if(c) {
					end.add(i);
					c = false;
				}
			}
			if(i == str.length() - 1) {
				if(c) end.add(i+1);
			}
		}
		
		int result = 0;
		for(int i = 0; i < begin.size(); i++) {
			result += Integer.parseInt(str.substring(begin.get(i), end.get(i)));
		}
		return result;
	}
	
	static boolean isNum(char c) {
		if('0' <= c && c <= '9') return true;
		else return false;
	}
}