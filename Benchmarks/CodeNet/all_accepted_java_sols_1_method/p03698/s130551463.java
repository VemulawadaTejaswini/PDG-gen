import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String s = sc.next();
	  char [] str = s.toCharArray();
	  int c=0;
out:	  for(int i=0;i<str.length-1;i++) {
	    	   for(int j=i+1;j<str.length;j++) {
	    		   if(str[i]==str[j]) {
	    			   c++;
	    			   break out;
	    		   }
	    	   }
	  }

	 if(c==0)System.out.print("yes");
	 else System.out.print("no");
	 sc.close();
    }
}