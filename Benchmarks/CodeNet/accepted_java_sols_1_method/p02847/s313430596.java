import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	String[] s={"SUN","MON","TUE","WED","THU","FRI","SAT"};
	for(int i=0;i<s.length;i++){
	    if(S.equals(s[i])){
		System.out.println(7-i);
	    }
	}
    }
}
