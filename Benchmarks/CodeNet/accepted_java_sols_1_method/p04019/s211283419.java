import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	Set<Character> news = new HashSet<>(); 
    	for (char c : S.toCharArray()) {
    		news.add(c);
    	}
    	switch (news.size()) {
    	case 1 :
    	case 3 :
    		System.out.println("No");
    		break;
    	case 4 :
    		System.out.println("Yes");
    		break;
    	case 2 :
    		if ((news.contains('N') && news.contains('S')) ||
    				(news.contains('E') && news.contains('W'))) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}
    	}
    }
}