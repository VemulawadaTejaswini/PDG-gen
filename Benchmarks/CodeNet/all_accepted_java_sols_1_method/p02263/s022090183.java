import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] A=br.readLine().split("\\s+");
		LinkedList<Integer> stack=new LinkedList<Integer>();
		for (int i = 0; i < A.length; i++) {
			if ('0'<=A[i].charAt(0) && A[i].charAt(0)<='9') {
					int num=Integer.parseInt(A[i]);				
					stack.push(num);
			}else{
				
				int b=stack.pop();
				int a=stack.pop();
			    int c=0;
			    if('+'==A[i].charAt(0)){
			    	c=a+b;
			    }else if('-'==A[i].charAt(0)){
			    	c=a-b;
			    }else if('*'==A[i].charAt(0)){
			    	c=a*b;
			    }else{
			    	System.out.println("bad");
			    }
			    stack.push(c);		    
			}
			
		}
		System.out.println(stack.pop());
	}
}