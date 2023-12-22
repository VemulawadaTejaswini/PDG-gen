//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String o = sc.next();
    	String e = sc.next();
    	StringBuilder ans = new StringBuilder();
    	for(int i=0;i<o.length();i++) {
    		ans.append(o.substring(i,i+1));
    		if(i != e.length()) {
    			ans.append(e.substring(i,i+1));
    		}
    	}
    	System.out.println(ans);
    }
}