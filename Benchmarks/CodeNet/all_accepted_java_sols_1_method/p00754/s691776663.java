import java.util.*;
 
class Main {
    
	static int res=0,d,w,E[][]=new int[10][10];
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   String str=cin.nextLine();
    	   if(str.equals("."))break;
    	   char A[]=str.toCharArray();
    	   boolean jd=true;
    	   Deque<Character> B=new ArrayDeque<>();
    	   
    	   for(int i=0;i<A.length;i++) {
    		   if(A[i]==')' && (B.isEmpty() || B.getFirst()=='[')) {
    			   jd=false;
    			   break;
    		   }
    		   else if(A[i]==']' && (B.isEmpty() || B.getFirst()=='(')) {
    			   jd=false;
    			   break;
    		   }
    		   
    		   if(A[i]==']')B.pop();
    		   else if(A[i]==')')B.pop();
    		   else if(A[i]=='[')B.push('[');
    		   else if(A[i]=='(')B.push('(');
    	   }
    	   
    	   if(B.isEmpty() && jd)System.out.println("yes");
    	   else System.out.println("no");
       }
    }
}
