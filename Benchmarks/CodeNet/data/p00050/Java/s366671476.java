import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		String[] s = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < s.length; i++){
			if( s[i].equals("apple") ){
				s[i] = "peach";
			} else if( s[i].equals("peach") ){
				s[i] = "apple";
			} else if( s[i].length() > 5 ){
				int start = 0;
				int indexA;
				int indexP;
				while( (indexA = s[i].indexOf("apple", start)) >= 0 || (indexP = s[i].indexOf("peach", start)) >= 0 ){
					indexP = s[i].indexOf("peach", start);
					int key = indexA;
					if( key < 0 ){
						key = indexP;
					} else if( indexP >= 0 && key > indexP ){
						key = indexP;
					}
				//	System.out.println(key);
					StringBuilder temp = new StringBuilder(s[i]);
					if( s[i].charAt(key) == 'a' ){
						temp.replace(key, key+5, "peach");
					} else {
						temp.replace(key, key+5, "apple");
					}
					s[i] = temp.toString();
					start = key+5;
				}
			}
			result.append(s[i] + " ");
		}
		result.deleteCharAt(result.length()-1);
		System.out.println(result);
	}
}