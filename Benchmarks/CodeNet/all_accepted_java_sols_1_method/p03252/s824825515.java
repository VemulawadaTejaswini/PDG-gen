import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String S = scanner.next();
	    String T = scanner.next();
	    String al = "abcdefghijklmnopqrstuvwxyz";
	    String r = "Yes";
	    boolean flg = false;
	    for (int i = 0; i< al.length(); i++) {
	    	if (flg) {
	    		break;
	    	}
	        char target = al.charAt(i);
	        List<Integer> l = new ArrayList<Integer>();
	        for (int j = 0; j< S.length(); j++) {
	            char s = S.charAt(j);
	            if (s == target) {
	                l.add(j);
	            }
	        }
	        if (l.size() > 1) {
	        	char t0 = T.charAt(l.get(0));
	        	for (int j = 1; j< l.size(); j++) {
		            char t = T.charAt(l.get(j));
		            if (t != t0) {
                        r = "No";
                        flg = true;
                        break;
		            }
		        }
	        }
	    }

	    for (int i = 0; i< al.length(); i++) {
	    	if (flg) {
	    		break;
	    	}
	        char target = al.charAt(i);
	        List<Integer> l = new ArrayList<Integer>();
	        for (int j = 0; j< T.length(); j++) {
	            char t = T.charAt(j);
	            if (t == target) {
	                l.add(j);
	            }
	        }
	        if (l.size() > 1) {
	        	char s0 = S.charAt(l.get(0));
	        	for (int j = 1; j< l.size(); j++) {
		            char s = S.charAt(l.get(j));
		            if (s != s0) {
                        r = "No";
                        flg = true;
                        break;
		            }
		        }
	        }
	    }


        System.out.print(r);
	}
}