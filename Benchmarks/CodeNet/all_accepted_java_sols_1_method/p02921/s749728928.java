import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  S = sc.next();
    String  T = sc.next();    

    char[] s = S.toCharArray();
    char[] t = T.toCharArray();

    int cou = 0;
    for(int i=0; i<3; i++){
	if(s[i]==t[i]){
	    cou++;
	}
    }
		System.out.println(cou);
	}
}