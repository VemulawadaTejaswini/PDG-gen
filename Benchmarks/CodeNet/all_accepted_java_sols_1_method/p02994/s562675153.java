import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int yotei = (n*(l+l+n-1)/2);
    if(l<=0&&(l+n)>=1){
      System.out.println(yotei);
    }else if(l>0){
      System.out.println(yotei-l);
    }else if(l<=0&&(l+n)<1){
      System.out.println(yotei-(l+n-1));
    }else{
    }
    
      
    
      
  }
}