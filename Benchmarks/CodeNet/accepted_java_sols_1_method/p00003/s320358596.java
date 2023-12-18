import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int k,a,b,c;
	
	k = s.nextInt();
	
	for(int i=0;i<k;i++){
	    a=s.nextInt();
	    b=s.nextInt();
	    c=s.nextInt();
	    
	    if(b>a&&b>c){
		int swap = b;
		b=c;
		c=swap;
	    }else if(a>b&&a>c){
		int swap = a;
		a=c;
		c=swap;
	    }
	    
	    if((c*c)==(a*a+b*b)){
		System.out.println("YES");
	    }
	    else{
		System.out.println("NO");
	    }
	    
	}
    }
}