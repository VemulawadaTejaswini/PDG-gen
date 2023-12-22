import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer>s1=new Stack<Integer>();
		Stack<Integer>s2=new Stack<Integer>();
		int time=sc.nextInt();
		int a[]=new int[10];
		while(time-->0) {
			s1.clear();
			s2.clear();
		    for(int i=0;i<10;i++) {
		    	a[i]=sc.nextInt();
		    }
		    s1.add(0);
		    s2.add(0);
		    int flag=0;
		    for(int i=0;i<10;i++) {
		    	if(s1.peek()>=s2.peek()) {
		    		if(s1.peek()<a[i]) {
		    			s1.add(a[i]);
		    		}else if(s2.peek()<a[i]) {
		    			s2.add(a[i]);
		    		}else {
		    			flag=1;
		    			break;
		    		}
		    	}else {
		    		if(s2.peek()<a[i]) {
		    			s2.add(a[i]);
		    		}else if(s1.peek()<a[i]) {
		    			s1.add(a[i]);
		    		}else {
		    			flag=1;
		    			break;
		    		}
		    	}
		    }
		    if(flag==1) {
		    	System.out.println("NO");
		    }else {
		    	System.out.println("YES");
		    }
		}
	}
}

