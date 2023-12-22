import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
  		int b=sc.nextInt();
  		int c=Math.min(a,b);
  		int d=Math.max(a,b);
     String f= String.valueOf(c);
     String ans=""; 
    for(int e=0; e<d; e++){
     ans= ans+f;
    }
  
  	
    System.out.println(ans);
    
    
   
    }
}