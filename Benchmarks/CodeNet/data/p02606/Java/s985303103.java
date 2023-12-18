import java.util.*;
 
public class Main{
 
  public static void main(String args[])
  {
   
    Scanner sc = new Scanner(System.in);
    
    int l = sc.nextInt();
    int r = sc.nextInt();
    
    int d = sc.nextInt();
    
    int rem = l%d;
    
    if(rem!=0)
    l = l+ d - rem;
    
    int re = r%d;
    r = r - re ;
    
    int ans = (r - l)/d+1;
   
    
    System.out.println(ans);
    
  }
  
  
  
}