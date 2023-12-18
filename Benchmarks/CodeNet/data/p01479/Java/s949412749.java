import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.next();
		String[] s = new String[1000];
		int index = 0;
		int start = 0;
		for(int i = 0; i < str.length(); i++){
			if( i+3 < str.length() ){
				s[index] = str.substring(start);
			}
			if( str.charAt(i) == 'e' ){
				if( i+3 < str.length() ){
					if( str.charAt(i+3) == 'e' ){
						s[index] = str.substring(start, i+3);
						start = i+3;
						index++;
					}
					i += 2;
				} else {
					s[index] = str.substring(start);
					index++;
					break;
				}
			} else {
				if( i+7 < str.length() ){
					if( str.charAt(i+7) == 'c' ){
						s[index] = str.substring(start, i+7);
						start = i+7;
						index++;
					}
					i += 6;
				} else {
					s[index] = str.substring(start);
					index++;
					break;
				}
			}
		}
		int ans = 0;
		int max = 0;
		for(int i = 0; i < index; i++){
			if( s[i].length() > max ){
				max = s[i].length();
				ans = i;
			}
		}
		if( s[ans].charAt(s[ans].length()-1) == 'n' ){
			System.out.println("chicken");
		} else {
			System.out.println("egg");
		}
	}
}