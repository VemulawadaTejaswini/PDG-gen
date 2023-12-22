import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int len = str.length();
	int cnt01 = 0;
	int cnt10 = 0;
	if(len==1) {
	    System.out.println(0);
	    return;
	}
	for(int i = 0; i<len; i++) {
	    if(i%2 == 0) {
		if(str.charAt(i) == '1') cnt01++;
		else cnt10++;
	    } else {
		if(str.charAt(i) == '0') cnt01++;
		else cnt10++;
	    }
	}
	System.out.println(Math.min(cnt01,cnt10));
    }
}