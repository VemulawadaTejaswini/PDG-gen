import java.util.*;

class Main{
	int a;
	String op;
	int b;
	public Main(){
	    Scanner scan = new Scanner(System.in);
		for(;;){
			a=scan.nextInt();
			op=scan.next();
			b=scan.nextInt();
		    if(op.equals("+")){
			     System.out.println(a+b);
		    }else if(op.equals("-")){
			     System.out.println(a-b);
		    }else if(op.equals("*")){
			     System.out.println(a*b);
		    }else if(op.equals("/")){
		 	     System.out.println(a/b);
		    }else if(op.equals("?")){
			     break;
		    }
		}
	}
	public static void main(String[]args){
		new Main();
	}
}