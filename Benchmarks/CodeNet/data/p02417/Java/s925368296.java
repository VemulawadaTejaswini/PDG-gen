import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		
		while (sc.hasNext()){
			String buf = sc.nextLine();
			str += buf;
		}
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++){
			count[Integer.parseInt("" + str.charAt[i] - 'a')]++;
		}
		
		for (int i = 0; i < 26; i++){
			System.out.println(String.valueOf('a' + i) + " : " + count[i]);
		}
	}
}