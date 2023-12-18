import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	while(true){
	    int ans=0;
	    int f=0;
	    int a = cin.nextInt();
	    String o = cin.next();
	    char[] op = o.toCharArray();
	    
	    int b = cin.nextInt();
	    switch(op[0]){
	    case '+':
		ans = a+b;
		break;
	    case '-':
		ans = a-b;
		break;
	    case '*':
		ans = a*b;
		break;
	    case '/':
		ans = a/b;
		break;
	    case '?':
		f=1;
	    }
	    if(f==0){
		System.out.printf("%d\n",ans);
	    }
	    else{
		break;
	    }
	}
    }
}