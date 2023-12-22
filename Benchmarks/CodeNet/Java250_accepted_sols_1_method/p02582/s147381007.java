import java.util.*;
 
class Main{
 
public static void main(String args[]){
 
Scanner s =  new Scanner(System.in);
		String s1 = s.next();
		 
		int count=0;int 
		maxcount=0;
		for(int i=0;i<s1.length();i++){
		 
		if(s1.charAt(i) == 'R') {
			count++;
			if(count>maxcount)
		        maxcount=count;
			//System.out.println(count);
		}
		else {
			
		count=0;
		       
		}
		    
		}
		 
		System.out.println(maxcount);
}
}