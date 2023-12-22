import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        ArrayList<Integer>ans  = new ArrayList<>();
        
        int cou = 0;
        for(int i=0; i<S.length(); i++) {
        if(ss[i]=='A' || ss[i]=='C' || ss[i]=='G' || ss[i]=='T') {
        	cou++;
        }else {
        	ans.add(cou);
                cou = 0;
        }
        }
        Collections.sort(ans,Collections.reverseOrder());
        if(ans.size()==0){	 
        	System.out.println(S.length());
        }else {
        	System.out.println(Math.max(cou,ans.get(0)));
    }
}
}
