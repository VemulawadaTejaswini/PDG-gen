import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	String s = S.replaceAll("/","");
	int num = Integer.parseInt(s);
	if(num<=20190430){
	    System.out.println("Heisei");
	}else{
	    System.out.println("TBD");
	}
    }
}

	       
