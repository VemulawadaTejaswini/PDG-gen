import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n = stdIn.nextInt();
	String s = stdIn.next();
	int count=0;
	String S=s.replaceAll("ABC","-");
	for(int i=0;i<S.length();i++){
	    if(S.charAt(i)=='-'){
		count++;
	    }
	}
	System.out.println(count);
    }
}
