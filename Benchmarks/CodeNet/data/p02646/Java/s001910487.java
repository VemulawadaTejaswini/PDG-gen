import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long v = sc.nextLong();
	long b = sc.nextLong();
	long w = sc.nextLong();
	long t = sc.nextLong();
	boolean esc = false;
	//boolean sign = true;
	/*
	if(a<b){
	    sign = false;
	}
	*/
	for(long i=0;i<t;i++){
	    /*
	    if(sign){
		a+=v;
		b+=w;
	    }else{
		a-=v;
		b-=w;
	    }
	    if(sign&&a>=b){
		esc = true;
		break;
	    }else if(!sign&&a<=b){
		esc = true;
		break;
	    }
	    */
	    a+=v;
	    b+=w;
	    if(a>=b){
		esc = true;
		break;
	    }
	}
	if(esc){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
      }
}
