import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String str = sc.next();

	String rts = "";
	for(int i=str.length()-1; i>=0; i--){
	    String s = str.substring(i,i+1);
	    rts += s;
	}

	System.out.println(rts);
    }
}