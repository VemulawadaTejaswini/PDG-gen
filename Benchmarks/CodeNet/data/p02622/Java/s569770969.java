import java.util.*;
public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int ans =0;
	
	String S[]=sc.nextLine().split("");
	String T[]=sc.nextLine().split("");
	for(int i=0; i<S.length; i++){
	    if( !S[i].equals(T[i])){
		ans++;
	    }
	}
	System.out.println(ans);
    }
    
}
