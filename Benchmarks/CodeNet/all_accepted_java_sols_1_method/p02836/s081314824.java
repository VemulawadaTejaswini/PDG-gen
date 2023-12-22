import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String S = stdIn.next();
	int min = 0;
	for(int i=0;i<S.length()/2;i++){
	    if(S.charAt(i)!=S.charAt(S.length()-i-1)){
		min++;
	    }
	}
	System.out.println(min);
    }
}
