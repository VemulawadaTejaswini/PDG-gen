import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long ans=0;
    long max=0;
    for(int i=0;i<N;i++){
      long height=s.nextInt();
      if(height<=max) ans+=max-height;
      else max=height;
    }
    System.out.println(ans);
    
  }  
}