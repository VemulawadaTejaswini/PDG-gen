import java.util.Hashtable;
import java.util.Scanner;


public class AOJ_Volume0039 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Hashtable<Character,Integer> roman = new Hashtable<Character,Integer>();
		roman.put('I',1);
		roman.put('V',5);
		roman.put('X',10);
		roman.put('L',50);
		roman.put('C',100);
		roman.put('D',500);
		roman.put('M',1000);
		while(sc.hasNext()){
			char[] s = sc.nextLine().toCharArray();
			int ans = 0;
			for(int i=0;i<s.length-1;i++){
				if(roman.get(s[i]) >= roman.get(s[i+1])) ans += roman.get(s[i]);
				else ans -= roman.get(s[i]);
			}
			ans += roman.get(s[s.length - 1]);
			System.out.println(ans);
		}
	}
}