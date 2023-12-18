import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	int count = 0;
	int max = 0;
	int l = 0;

	String s = sc.next();
	String t = sc.next();  //短い
	int result = t.length();

	ArrayList<String> S = new ArrayList<>();

	for(int i = 0; i < s.length(); i++) {
		S.add(s.substring(i, i+1));
	}

ArrayList<String> T = new ArrayList<>();

	for(int i = 0; i < t.length(); i++) {
		T.add(t.substring(i, i+1));
	}

	for(int i = 0; i < s.length(); i++) {
		count = 0;
		if(T.get(0).equals(S.get(i))) {
			l = 0;
			for(int j = 1; j < t.length(); j++) {
				l++;
				if(T.get(j).equals(S.get(i + l))) {
					count ++;	
					if(count > max) {
						max = count;
					}else {
						break;
					}
				}
			}
		}
	}

	System.out.println(result- max);
}
}
