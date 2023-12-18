import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	String s = scan.next();
	s = s.substring(0,s.length()-1);

	while(true){
	    if(s.length() % 2 == 1){
		s = s.substring(0,s.length()-1);
	    }else{
		String sub1 = s.substring(0,s.length()/2);
		String sub2 = s.substring(s.length()/2, s.length());
		if(sub1.equals(sub2)){
		    break;
		}else{
		    s = s.substring(0,s.length()-2);
		}
	    }
	}

	System.out.println(s.length());
    }
}
