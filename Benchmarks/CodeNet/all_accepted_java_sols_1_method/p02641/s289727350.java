import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int n = sc.nextInt();	 
    Integer[] p = new Integer[n];	
    for (int i=0; i<n; i++) {	
      p[i] =sc.nextInt();	  
    }	
    int sub = -100;
    if (n==0) {
      System.out.println(x);
      return;
    }	        	
    for (int i=x-n; i<x+n; i++) {	
      if ( Arrays.asList(p).contains(i))
        continue;
      if ( Math.abs(x-sub) > Math.abs(x-i) ){
        sub = i;
        continue;
      }
      if ( Math.abs(x-sub) < Math.abs(x-i))
        break;   
    }
    System.out.println(sub);
    sc.close();
  }
}