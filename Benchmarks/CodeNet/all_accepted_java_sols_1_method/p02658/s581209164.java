import java.util.Scanner;
import java.util.ArrayList;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long a = 1;
	double p = 0;
	int n = sc.nextInt();
	boolean zero = false;
	long m;
	ArrayList<Long> l = new ArrayList<Long>();
	for(int i=0;i<n;i++){
	    m = sc.nextLong();
	    if(m==0){
		zero = true;
	    }
	    if(zero){
		continue;
	    }
	    if(!zero){
		p+=Math.log10(m);
		l.add(m);
	    }
	}
	long x = 1;
	for(int i=0;i<18;i++){
	    x*=10;
	}
	if(!zero&&p<=18){
	    for(int i=0;i<l.size();i++){
		a*=l.get(i);
	    }
	    if(a>x){
		System.out.println("-1");
	    }else{
		System.out.println(a);
	    }
	}else if(zero){
	    System.out.println("0");
	}else{
	    System.out.println("-1");
	}
      }
}
