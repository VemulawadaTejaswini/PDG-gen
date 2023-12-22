import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		String str = scan.next();
		String s = "CODEFESTIVAL2016";
		int cnt = 0;
		for(int i = 0 ; i < s.length(); i++){
			if(str.charAt(i) == s.charAt(i)){
				
			} else {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
}
