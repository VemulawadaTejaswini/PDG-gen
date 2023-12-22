import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S  = sc.next();
    String T  = sc.next();
    char[]ss = S.toCharArray();
    char[]tt = T.toCharArray();
    
    int cou = 0;
    for(int i=0; i<S.length(); i++){
        if(ss[i]!=tt[i]){
            cou++;
        }
    }
    	System.out.println(cou);
}
}