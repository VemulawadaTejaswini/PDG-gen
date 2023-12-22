import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();
    ArrayList<Integer>ans  = new ArrayList<>();

    int a = 0;
    ans.add(a);
    for(int i=0; i<n; i++) {
    	if(ss[i] == 'I') {
    	a += 1;
    	ans.add(a);
    	}else {
    	a -= 1;
    	ans.add(a);
    	}
    }
    	Collections.sort(ans,Collections.reverseOrder());   		

    	System.out.println(ans.get(0));
    }
}
