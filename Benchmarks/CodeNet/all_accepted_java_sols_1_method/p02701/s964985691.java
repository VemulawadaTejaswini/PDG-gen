import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 int count=0;
	  Set<String> set = new HashSet<String>();
	 while(t-->0){
	     String str= sc.next();
	    
	     set.add(str);
	 
}
 for(String stock : set){
   count++;
}
System.out.println(count);
	 
	}
}