import java.util.*;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b){
	    if(b<c) System.out.println(a+" "+b+" "+c);
	    else{ System.out.println(a+" "+c+" "+b);
	    }
	}
	else if(b<c){
	    if(c<a) System.out.println(b+" "+c+" "+a);
	    else{ System.out.println(b+" "+a+" "+c);
	    }
	}
	else if(c<a){
	    if(a<b) System.out.println(c+" "+a+" "+b);
	    else{ System.out.println(c+" "+b+" "+a);
	    }
	}
    }
}