import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    
    StringBuffer buf = new StringBuffer();
    
    for(int i=0; i<n; i++){
      char si = s.charAt(i);
      
      if(i == k-1){
        if(si == 'A'){
        buf.append("a");
        }
        
        if(si == 'B'){
        buf.append("b");
        }
        
        if(si == 'C'){
        buf.append("c");
        }
      }else{
        buf.append(s.charAt(i));
      }
    }
    
    String new_s = buf.toString();
    
    System.out.println(new_s);
  }
}