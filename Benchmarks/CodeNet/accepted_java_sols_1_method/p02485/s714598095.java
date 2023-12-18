import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	while(true){
	    String str = in.next();
	    int res = 0;

	    if (str.equals("0")) {
		break;
	    }	    

	    for (int i = 0 ; i < str.length() ; i++) {
		char c = str.charAt(i);
		res += c - '0';	
	    }

	    System.out.println(res);
	}
    }
}