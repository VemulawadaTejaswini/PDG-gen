import java.util.*;
public class Main {
	static String hyou = "qwertyuiopasdfghjklzxcvbnm";
	static String hyou2= "QWERTYUIOPASDFGHJKLZXCVBNM";
	static char henkan(char n){
		for(int i=0;i<hyou.length();i++){
			if(hyou.charAt(i)==n)return hyou2.charAt(i);
		}
		return n;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String input = in.nextLine();
			String result="";
			for(int s=0;s<input.length();s++){
				result+=henkan(input.charAt(s));
			}
			System.out.println(result);
		}
	}
}