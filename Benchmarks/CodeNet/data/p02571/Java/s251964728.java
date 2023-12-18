//package hiougyf;

import java.util.*;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Reader sc=new Reader();
        Scanner sc =new Scanner(System.in);
     String s=sc.next();
      String t=sc.next();
      int n=s.length();
      int m=t.length();
      int min=Integer.MAX_VALUE;
     // if(n<m) System.out.println();
      for(int i=0;i<=(n-m);i++) {
    	  String c=s.substring(i,(i+m));
    	//  System.out.println(c);
    	  int h=find(c,t,m);
    	   min=Math.min(min, h);
      }
      System.out.println(min);
	}
      static int find(String s,String t,int n) {
    	  int ans=0;
    	  for(int i=0;i<n;i++) {
    		  if(s.charAt(i)!=t.charAt(i)) ans++;
    	  }
    	  return ans;
      }
    
         
  public static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
          
        return gcd(b%a, a); 
    } 
   public static int lcm(int a, int b)  
  {  
     return (a*b)/gcd(a, b);  
	}

}
