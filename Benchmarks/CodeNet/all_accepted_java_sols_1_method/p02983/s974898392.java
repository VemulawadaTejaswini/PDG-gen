import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l=sc.nextInt();
    int r=sc.nextInt();
    int tmp=10000;
    if(r-l>=2019){
      System.out.println(0);
      return;
    }else{
      l=l%2019;
      r=r%2019;
      for(int i=l;i<=r-1;i++){
        for(int j=l+1;j<=r;j++){
          if(tmp>(i*j)%2019){
            tmp=(i*j)%2019;
          }
        }
      }
      System.out.println(tmp);
      
      
    }
    
  }
  

  
}