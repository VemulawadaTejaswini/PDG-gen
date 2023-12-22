import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    long a = sc.nextInt();
	    long b = sc.nextInt();
	    
	    long smaller = a;
	    long larger = b;
	    if(b<smaller){smaller = b; larger = a;}
	    
	    long aa = a;
	    long bb = b;
	    while(bb!=0){
		long tmp = bb;
		bb = aa%bb;
		aa = tmp;
	    }

	    long lcm = (a*b)/aa;
	    
	    System.out.println(aa+" "+lcm);
	}
    }
}