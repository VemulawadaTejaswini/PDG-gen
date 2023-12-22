import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),w=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++){
      s[i]=sc.next();
      System.out.println(s[i]+"\n"+s[i]);
    }
    
  }
}
