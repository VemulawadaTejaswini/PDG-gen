import java.io.*;
import java.util.*;

class Main{
    int gcd(int a, int b){
	return b==0?a:gcd(b,a%b);
    }
    
    void ini(){
	Scanner sc = new Scanner(System.in);
	int a, b, c, det, div;
	while(true){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    
	    if(a==0 && b==0 && c==0)
		break;
	    det = b*b-4*a*c;
	    
	    if(det<0)
		System.out.println("Impossible");
	    else if(det==0)
		System.out.println((int)Math.sqrt(a)+" "+(int)Math.sqrt(c)+" "+(int)Math.sqrt(a)+" "+(int)Math.sqrt(c));
	    else{
		int test = (int)Math.sqrt(det);
		if(test*test != det){
		    System.out.println("Imossible");
		    continue;
		}
		int p = 2*a;
		int q = b-(int)Math.sqrt(det);
		int r = 2*a;
		int s = b+(int)Math.sqrt(det);
		div = gcd(p, (int)Math.abs(q));
		p = p/div;
		q = q/div;
		div = gcd(r, (int)Math.abs(s));
		r = r/div;
		s = s/div;
		if(p>r || (p==r && q>=s))
		    System.out.println(p+" "+q+" "+r+" "+s);
		else
		    System.out.println(r+" "+s+" "+p+" "+q);
	    }
	}
    }
    
    public static void main(String[] args){
	new Main().ini();
    }
}