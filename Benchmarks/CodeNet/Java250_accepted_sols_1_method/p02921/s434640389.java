import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String c = sc.next();
		char[] sChar = new char[3];
		char[] cChar = new char[3];
		int count = 0;
		for(int i = 0; i < 3; i++){
			sChar[i] = s.charAt(i);
			cChar[i] = c.charAt(i);
			if(sChar[i] == cChar[i]){
				count++;
			}
		}
		System.out.println(count);
	}
 
}