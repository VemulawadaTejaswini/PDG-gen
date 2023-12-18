import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    String op = kbd.next();
	    int b = kbd.nextInt();
	
	    if(op.equals("?")){
		;
	    }
	    else{
		int x = a+b;
		if(op.equals("-")) x = a-b;
		if(op.equals("*")) x = a*b;
		if(op.equals("/")) x = a/b;
		System.out.println(x);
	    }
	}
    }
}