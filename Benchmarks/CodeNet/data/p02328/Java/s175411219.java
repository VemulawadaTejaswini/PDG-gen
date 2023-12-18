
import java.util.*;
public class Main {
	
	static int pos=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		long max=0;
		Stack<Rect> stk=new Stack<>();
		
		for(int i=0;i<N;i++) {
			long h=Long.parseLong(in.next());
			
			if(stk.isEmpty() || h>stk.peek().h) {
				stk.push(new Rect(h,i));
			}
			else if(h<stk.peek().h) {
				max=Math.max(max,createRect(stk,h,i));
				stk.push(new Rect(h,pos));
			}
			
		}
		max=Math.max(max, createRect(stk,0,N));
		
		System.out.println(max);
	}
	
	static long createRect(Stack<Rect> stk,long h,int i) {
		long max=0;
		while(!stk.isEmpty()) {
			Rect crect=stk.peek();
			if(crect.h<h)break;
			
			max=Math.max(max, crect.h*(i-crect.i));
			pos=crect.i;
			stk.pop();
		}
		return max;
	}
	
}

class Rect{
	long h;
	int i;
	Rect(long a,int b){
		h=a;i=b;
	}
}


