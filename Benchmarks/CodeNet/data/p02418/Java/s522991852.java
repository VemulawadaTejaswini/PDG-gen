import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        String S = sc.nextLine();
        String P = sc.nextLine();
        int count=0,k=0,flag=0;
        
        for(int i=0;i<S.length();i++) {
        	
	     if(S.charAt(i) == P.charAt(0)) {
	    	 
	      for(int j=i;j<i+P.length();j++) {
	    	  
	       if(j<S.length())
		     if(S.charAt(j)==P.charAt(k)) count++;
		     else count+=0;
	       
		   else if(S.charAt(j-S.length())==P.charAt(k)) count++; 

	        k++;
	       }
	     
	      if(count==P.length()) flag=1;
	      
	      count=0;
	      k=0;
	     
	     }
	     
        }
	     
	    if(flag==1) System.out.println("Yes");
	    else System.out.println("No");
	     
        }
        
        
}
