import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n,r;
    n=sc.nextInt();
    r=sc.nextInt();
    if(n<10){
      System.out.print((r+100*(10-n)));
    }else{
      System.out.print(r);
    }
  }
}