import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a,b;
	char op;
	int ans;
	while(true){
	    a = in.nextInt();
	    op = in.next().charAt(0);
	    b = in.nextInt();

	    if(op == '+'){
		ans = a+b;
		System.out.println(ans);
	    }
	    else if(op == '-'){
		ans = a-b;
		System.out.println(ans);
	    }
	    else if(op == '/'){
		ans = a/b;
		System.out.println(ans);
	    }
	    else if(op == '*'){
		ans = a*b;
		System.out.println(ans);
	    }
	    else if(op == '?')break;
	}
    }
}

