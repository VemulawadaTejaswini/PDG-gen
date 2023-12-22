import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	int index = -1;
	int firstIndex = -1;
	for(int i = s.length() - 1; i>=0; i--) {
	    String sb;
	    firstIndex = i-t.length()+1;
	    if(firstIndex<0) break;
	    if(i+1 > s.length()-1) {
		sb = s.substring(firstIndex);
	    }else {
		sb = s.substring(firstIndex, i+1);
	    }
	    for(int j = t.length() - 1; j>=0; j--) {
		char cs = sb.charAt(j);
		char ct = t.charAt(j);

		if(cs == '?' && j == 0) index = firstIndex;
		if(cs == '?') continue;
		if(cs != ct) break;
		if(j == 0) index = firstIndex;
	    }
	    if(index != -1) break;
	}
	if(index == -1) {
	    System.out.println("UNRESTORABLE");
	    return;
	}
	StringBuilder builder = new StringBuilder();
	for(int i = 0; i < s.length(); i++) {
	    if(i == firstIndex) {
		builder.append(t);
		i= i+t.length()-1;
		continue;
	    }
	    char c = (s.charAt(i)=='?')? 'a' : s.charAt(i);
	    builder.append(c);
	}
	System.out.println(builder.toString());

    }
}