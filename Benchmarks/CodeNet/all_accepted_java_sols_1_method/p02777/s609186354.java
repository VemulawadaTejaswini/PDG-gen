import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String s=sc.next(), t=sc.next();
    int si=sc.nextInt(), ti=sc.nextInt();
    String u =sc.next();
    
    if(u.equals(s)) si--;
    else ti--;
    
    System.out.println(si +" "+ti);
  }
}