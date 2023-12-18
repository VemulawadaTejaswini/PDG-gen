import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s;
		s=cin.nextLine();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(65<=c && c<=90){
				c=(char)((int)c+32);
			}
			else if(97<=c && c<=122){
				c=(char)((int)c-32);
			}
			System.out.print(c);
		}
		System.out.println("");
	}
}