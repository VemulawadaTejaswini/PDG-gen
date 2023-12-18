import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    int n=s.length();
    for(int i=2;i<n;i+=2){
      String a=s.substring(0,(n-i)/2),b=s.substring((n-i)/2,n-i);
      if(a.equals(b)){
        System.out.println(n-i);
        break;
      }
      s=s.substring(0,n-2-i);
      
    }
  }
}
