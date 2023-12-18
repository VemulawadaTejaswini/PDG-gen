package mondaisyu5;

import java.util.*;

public class App {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
	  	String s=sc.next();
	  int c=0;
	  for(int i=0;i<=2;i++){
	  if( s.charAt(i)=='R'){
	    c++;
	    }
	  
	  else{
	    c=0;
	  }
	  }
	  System.out.println(c);

	}
}