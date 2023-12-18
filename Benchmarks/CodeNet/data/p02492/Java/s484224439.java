import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a, b, ans=0;
	char op;
	while(true){
            a = Integer.parseInt(s.next());
            op = s.next().charAt(0);
            b = Integer.parseInt(s.next());
	    
	    if(op == '?') break;
	    if(op == '+') ans = a + b;
	    if(op == '-') ans = a - b;
	    if(op == '*') ans = a * b;
	    if(op == '/') ans = a / b;

	    System.out.println(ans);
	}
    }
}