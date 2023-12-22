import java.util.*;
public class Main{
	static String BeautStr(String s){
		if(s.length()%2 != 0)return "No";
		for(int i=0; i<s.length(); i++){
			int count = 0;
			for(int j=0; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j))count++;
			}
			if(count %2 != 0)return"No";
		}
		return "Yes";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		System.out.println(BeautStr(w));
	}
}