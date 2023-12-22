import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		String s = in.next();
		boolean f = true;
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < s.length(); j++){
				if(i == j) continue;
				if(s.charAt(i) == s.charAt(j)){
					f = false;
					break;
				}
			}
		}
		System.out.println(f ? "yes" : "no");
	}
}
