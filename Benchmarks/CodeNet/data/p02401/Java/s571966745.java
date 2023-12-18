import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	while(true){
	    int a=sc.nextInt();
	    String op=sc.next();
	    int b=sc.nextInt();
	    if(op.equals("?"))break;
	    int ans=a+b;
	    if(op.equals("-"))ans=a-b;
	    if(op.equals("*"))ans=a*b;
	    if(op.equals("/"))ans=a/b;
	    System.out.println(ans);
	}
	
    }
    public static void main(String[]ag){
	new Main().main();
    }
}