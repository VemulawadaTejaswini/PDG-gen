import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      String n = sc.next();
	      char c = n.charAt(a);
	      int l = n.length();
	      String ans = "No";
	      if((a+b+1) == l && c == ('-')){
	    	  ans = "Yes";
	    	  for(int i = 0; i < a; i++) {
	    		  if(n.charAt(i) == '-') {
	    			  ans = "No";
	    		  }
	    	  }
	      for(int i = 0; i < b; i++) {
    		  if(n.charAt(a+1+i) == '-') {
    			  ans = "No";
    		  }
    	  }
      }
	      System.out.println(ans);
	}
}