import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	String[] s={"SUN","MON","TUE","WED","THU","FRI","SAT"};
	for(int i=0;i<s.length;i++){
	    if(S.equals(s[i])){
		if(i==0){
		    System.out.println("7");
		}else{
		    System.out.println(7-i);
		}
	    }
	}
    }
}
