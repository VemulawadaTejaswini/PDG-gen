import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    double t=sc.nextDouble();
    double a=sc.nextDouble();
    
    double h=0;
    double x=0;
    
    double tmp=100000;
    
    int ans=0;
    
    
    for(int i=1; i<n+1;i++){
      h=sc.nextDouble();
      x=t-h*6/1000;
      if( Math.abs(x-a)<tmp){
        tmp=Math.abs(x-a);
        ans=i;
        }
     }
     
     
      System.out.println(ans);
     


  }
}