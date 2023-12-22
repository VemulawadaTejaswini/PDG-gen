import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    char[]ss = S.toCharArray();
    char[]t = T.toCharArray();
    ArrayList<Integer>ans  = new ArrayList<>();

    for(int i=0; i<=S.length() - T.length(); i++) {
    	int cou = 0;
       	for(int j=0; j< T.length(); j++) {
      		if(ss[i+j] == t[j]) {
    		cou++;
    		}
    	}
    	ans.add(cou);
    	cou = 0;
    }
    Collections.sort(ans,Collections.reverseOrder());
    	System.out.println(T.length() - ans.get(0));
    	
      }
}
