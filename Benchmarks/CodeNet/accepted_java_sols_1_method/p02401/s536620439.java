import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0,b=0,ans=0,f=0;
        String op;
        while(f==0){
        	a=scan.nextInt();
        	op=scan.next();
        	b=scan.nextInt();
        	switch(op){
        		case"+":
        			ans=a+b;
        			break;
        		case"-":
        			ans=a-b;
        			break;
        		case"*":
        			ans=a*b;
        			break;
        		case"/":
        			ans=a/b;
        			break;
        		case"?":
        			f=1;
        			break;
        		default:
        			continue;
        	}
        	if(f==0){
        		System.out.println(ans);
        	}
        }
    }
}