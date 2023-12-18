import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b;
	int ans=0;
	char op;

	while(true){
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
	    
	    if(op == '?') break;
	    else if(op == '+') ans = a + b;
	    else if(op == '-') ans = a - b;
	    else if(op == '*') ans = a * b;
	    else if(op == '/') ans = a / b;
	    
	    System.out.println(ans);
	}
    }
}